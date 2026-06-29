// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class SetTokenPlanOrgInviteConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetTokenPlanOrgInviteConfigResponseBody body;

    public static SetTokenPlanOrgInviteConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTokenPlanOrgInviteConfigResponse self = new SetTokenPlanOrgInviteConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetTokenPlanOrgInviteConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTokenPlanOrgInviteConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetTokenPlanOrgInviteConfigResponse setBody(SetTokenPlanOrgInviteConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTokenPlanOrgInviteConfigResponseBody getBody() {
        return this.body;
    }

}
