// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeSendFileResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSendFileResultsResponse setBody(DescribeSendFileResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSendFileResultsResponseBody getBody() {
        return this.body;
    }

}
