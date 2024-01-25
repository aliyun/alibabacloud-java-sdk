// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AgainSubmitApplyPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgainSubmitApplyPermissionResponseBody body;

    public static AgainSubmitApplyPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        AgainSubmitApplyPermissionResponse self = new AgainSubmitApplyPermissionResponse();
        return TeaModel.build(map, self);
    }

    public AgainSubmitApplyPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgainSubmitApplyPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgainSubmitApplyPermissionResponse setBody(AgainSubmitApplyPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public AgainSubmitApplyPermissionResponseBody getBody() {
        return this.body;
    }

}
