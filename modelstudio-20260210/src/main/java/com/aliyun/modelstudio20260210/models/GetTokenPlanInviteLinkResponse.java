// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetTokenPlanInviteLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTokenPlanInviteLinkResponseBody body;

    public static GetTokenPlanInviteLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPlanInviteLinkResponse self = new GetTokenPlanInviteLinkResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenPlanInviteLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenPlanInviteLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTokenPlanInviteLinkResponse setBody(GetTokenPlanInviteLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenPlanInviteLinkResponseBody getBody() {
        return this.body;
    }

}
