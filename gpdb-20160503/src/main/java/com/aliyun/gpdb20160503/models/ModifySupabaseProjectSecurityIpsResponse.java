// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseProjectSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySupabaseProjectSecurityIpsResponseBody body;

    public static ModifySupabaseProjectSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseProjectSecurityIpsResponse self = new ModifySupabaseProjectSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseProjectSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySupabaseProjectSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySupabaseProjectSecurityIpsResponse setBody(ModifySupabaseProjectSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySupabaseProjectSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
