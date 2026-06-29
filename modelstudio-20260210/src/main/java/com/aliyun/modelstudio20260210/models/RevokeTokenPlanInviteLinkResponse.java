// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class RevokeTokenPlanInviteLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeTokenPlanInviteLinkResponseBody body;

    public static RevokeTokenPlanInviteLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeTokenPlanInviteLinkResponse self = new RevokeTokenPlanInviteLinkResponse();
        return TeaModel.build(map, self);
    }

    public RevokeTokenPlanInviteLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeTokenPlanInviteLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeTokenPlanInviteLinkResponse setBody(RevokeTokenPlanInviteLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeTokenPlanInviteLinkResponseBody getBody() {
        return this.body;
    }

}
