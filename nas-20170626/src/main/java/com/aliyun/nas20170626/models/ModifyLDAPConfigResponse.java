// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyLDAPConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLDAPConfigResponseBody body;

    public static ModifyLDAPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLDAPConfigResponse self = new ModifyLDAPConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLDAPConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLDAPConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLDAPConfigResponse setBody(ModifyLDAPConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLDAPConfigResponseBody getBody() {
        return this.body;
    }

}
