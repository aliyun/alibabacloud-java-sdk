// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateTenantMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTenantMemberResponseBody body;

    public static UpdateTenantMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantMemberResponse self = new UpdateTenantMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTenantMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTenantMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTenantMemberResponse setBody(UpdateTenantMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTenantMemberResponseBody getBody() {
        return this.body;
    }

}
