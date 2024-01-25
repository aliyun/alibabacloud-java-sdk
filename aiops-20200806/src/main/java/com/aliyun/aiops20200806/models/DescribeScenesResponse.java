// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeScenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScenesResponseBody body;

    public static DescribeScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScenesResponse self = new DescribeScenesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScenesResponse setBody(DescribeScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScenesResponseBody getBody() {
        return this.body;
    }

}
