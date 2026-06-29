// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateTokenPlanInviteLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTokenPlanInviteLinkResponseBody body;

    public static CreateTokenPlanInviteLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenPlanInviteLinkResponse self = new CreateTokenPlanInviteLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateTokenPlanInviteLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTokenPlanInviteLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTokenPlanInviteLinkResponse setBody(CreateTokenPlanInviteLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTokenPlanInviteLinkResponseBody getBody() {
        return this.body;
    }

}
