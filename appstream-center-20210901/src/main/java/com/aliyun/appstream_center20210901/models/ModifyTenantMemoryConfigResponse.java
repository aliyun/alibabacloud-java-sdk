// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyTenantMemoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTenantMemoryConfigResponseBody body;

    public static ModifyTenantMemoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantMemoryConfigResponse self = new ModifyTenantMemoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantMemoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantMemoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTenantMemoryConfigResponse setBody(ModifyTenantMemoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantMemoryConfigResponseBody getBody() {
        return this.body;
    }

}
