// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetTokenPlanOrgInviteConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTokenPlanOrgInviteConfigResponseBody body;

    public static GetTokenPlanOrgInviteConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPlanOrgInviteConfigResponse self = new GetTokenPlanOrgInviteConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenPlanOrgInviteConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenPlanOrgInviteConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTokenPlanOrgInviteConfigResponse setBody(GetTokenPlanOrgInviteConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenPlanOrgInviteConfigResponseBody getBody() {
        return this.body;
    }

}
