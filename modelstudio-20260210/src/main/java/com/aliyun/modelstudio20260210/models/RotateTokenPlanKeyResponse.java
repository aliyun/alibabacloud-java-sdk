// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class RotateTokenPlanKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RotateTokenPlanKeyResponseBody body;

    public static RotateTokenPlanKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        RotateTokenPlanKeyResponse self = new RotateTokenPlanKeyResponse();
        return TeaModel.build(map, self);
    }

    public RotateTokenPlanKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RotateTokenPlanKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RotateTokenPlanKeyResponse setBody(RotateTokenPlanKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public RotateTokenPlanKeyResponseBody getBody() {
        return this.body;
    }

}
