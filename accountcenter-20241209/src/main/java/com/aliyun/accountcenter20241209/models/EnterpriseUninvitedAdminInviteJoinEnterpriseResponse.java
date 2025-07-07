// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseUninvitedAdminInviteJoinEnterpriseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody body;

    public static EnterpriseUninvitedAdminInviteJoinEnterpriseResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseUninvitedAdminInviteJoinEnterpriseResponse self = new EnterpriseUninvitedAdminInviteJoinEnterpriseResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponse setBody(EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody getBody() {
        return this.body;
    }

}
