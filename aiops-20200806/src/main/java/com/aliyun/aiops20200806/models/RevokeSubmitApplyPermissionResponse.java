// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RevokeSubmitApplyPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeSubmitApplyPermissionResponseBody body;

    public static RevokeSubmitApplyPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeSubmitApplyPermissionResponse self = new RevokeSubmitApplyPermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeSubmitApplyPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeSubmitApplyPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeSubmitApplyPermissionResponse setBody(RevokeSubmitApplyPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeSubmitApplyPermissionResponseBody getBody() {
        return this.body;
    }

}
