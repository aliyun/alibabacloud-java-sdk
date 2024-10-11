// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddTenantMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTenantMembersResponseBody body;

    public static AddTenantMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTenantMembersResponse self = new AddTenantMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddTenantMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTenantMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTenantMembersResponse setBody(AddTenantMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTenantMembersResponseBody getBody() {
        return this.body;
    }

}
