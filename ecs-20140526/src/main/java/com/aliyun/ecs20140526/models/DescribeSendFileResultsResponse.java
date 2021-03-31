// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSendFileResultsResponseBody body;

    public static DescribeSendFileResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSendFileResultsResponse self = new DescribeSendFileResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSendFileResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSendFileResultsResponse setBody(DescribeSendFileResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSendFileResultsResponseBody getBody() {
        return this.body;
    }

}
