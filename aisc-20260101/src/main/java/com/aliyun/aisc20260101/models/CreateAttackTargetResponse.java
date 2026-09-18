// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateAttackTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAttackTargetResponseBody body;

    public static CreateAttackTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackTargetResponse self = new CreateAttackTargetResponse();
        return TeaModel.build(map, self);
    }

    public CreateAttackTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAttackTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAttackTargetResponse setBody(CreateAttackTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAttackTargetResponseBody getBody() {
        return this.body;
    }

}
