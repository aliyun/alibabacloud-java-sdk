// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengetResponseBody body;

    public static HuichengetResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengetResponse self = new HuichengetResponse();
        return TeaModel.build(map, self);
    }

    public HuichengetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HuichengetResponse setBody(HuichengetResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengetResponseBody getBody() {
        return this.body;
    }

}
