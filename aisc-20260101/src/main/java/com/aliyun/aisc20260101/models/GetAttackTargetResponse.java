// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetAttackTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttackTargetResponseBody body;

    public static GetAttackTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttackTargetResponse self = new GetAttackTargetResponse();
        return TeaModel.build(map, self);
    }

    public GetAttackTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttackTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttackTargetResponse setBody(GetAttackTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttackTargetResponseBody getBody() {
        return this.body;
    }

}
