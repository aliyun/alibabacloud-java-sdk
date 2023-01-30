// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyTenantConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantConfigResponseBody body;

    public static ModifyTenantConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantConfigResponse self = new ModifyTenantConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTenantConfigResponse setBody(ModifyTenantConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantConfigResponseBody getBody() {
        return this.body;
    }

}
