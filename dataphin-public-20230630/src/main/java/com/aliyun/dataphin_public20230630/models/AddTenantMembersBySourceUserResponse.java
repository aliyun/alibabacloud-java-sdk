// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddTenantMembersBySourceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTenantMembersBySourceUserResponseBody body;

    public static AddTenantMembersBySourceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTenantMembersBySourceUserResponse self = new AddTenantMembersBySourceUserResponse();
        return TeaModel.build(map, self);
    }

    public AddTenantMembersBySourceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTenantMembersBySourceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTenantMembersBySourceUserResponse setBody(AddTenantMembersBySourceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTenantMembersBySourceUserResponseBody getBody() {
        return this.body;
    }

}
