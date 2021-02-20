// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeScanSessionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScanSessionsResponseBody body;

    public static DescribeScanSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanSessionsResponse self = new DescribeScanSessionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScanSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScanSessionsResponse setBody(DescribeScanSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScanSessionsResponseBody getBody() {
        return this.body;
    }

}
