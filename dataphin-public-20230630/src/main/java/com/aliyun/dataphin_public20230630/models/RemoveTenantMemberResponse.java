// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveTenantMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveTenantMemberResponseBody body;

    public static RemoveTenantMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTenantMemberResponse self = new RemoveTenantMemberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTenantMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTenantMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTenantMemberResponse setBody(RemoveTenantMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTenantMemberResponseBody getBody() {
        return this.body;
    }

}
