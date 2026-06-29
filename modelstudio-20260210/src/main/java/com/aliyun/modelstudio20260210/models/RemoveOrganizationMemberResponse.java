// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class RemoveOrganizationMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveOrganizationMemberResponseBody body;

    public static RemoveOrganizationMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveOrganizationMemberResponse self = new RemoveOrganizationMemberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveOrganizationMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveOrganizationMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveOrganizationMemberResponse setBody(RemoveOrganizationMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveOrganizationMemberResponseBody getBody() {
        return this.body;
    }

}
