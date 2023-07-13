// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleInstanceResponseBody body;

    public static ScaleInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleInstanceResponse self = new ScaleInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ScaleInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleInstanceResponse setBody(ScaleInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleInstanceResponseBody getBody() {
        return this.body;
    }

}
