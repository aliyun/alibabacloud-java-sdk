// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class AddOrganizationMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddOrganizationMemberResponseBody body;

    public static AddOrganizationMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrganizationMemberResponse self = new AddOrganizationMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddOrganizationMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrganizationMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddOrganizationMemberResponse setBody(AddOrganizationMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrganizationMemberResponseBody getBody() {
        return this.body;
    }

}
