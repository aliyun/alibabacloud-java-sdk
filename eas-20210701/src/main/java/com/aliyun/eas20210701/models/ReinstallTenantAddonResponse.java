// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ReinstallTenantAddonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReinstallTenantAddonResponseBody body;

    public static ReinstallTenantAddonResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinstallTenantAddonResponse self = new ReinstallTenantAddonResponse();
        return TeaModel.build(map, self);
    }

    public ReinstallTenantAddonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinstallTenantAddonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReinstallTenantAddonResponse setBody(ReinstallTenantAddonResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinstallTenantAddonResponseBody getBody() {
        return this.body;
    }

}
