// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class DeleteAttackTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAttackTargetResponseBody body;

    public static DeleteAttackTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackTargetResponse self = new DeleteAttackTargetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAttackTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAttackTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAttackTargetResponse setBody(DeleteAttackTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAttackTargetResponseBody getBody() {
        return this.body;
    }

}
