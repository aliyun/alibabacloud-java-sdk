// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteMfaEnabledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOfficeSiteMfaEnabledResponseBody body;

    public static ModifyOfficeSiteMfaEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteMfaEnabledResponse self = new ModifyOfficeSiteMfaEnabledResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteMfaEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOfficeSiteMfaEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOfficeSiteMfaEnabledResponse setBody(ModifyOfficeSiteMfaEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfficeSiteMfaEnabledResponseBody getBody() {
        return this.body;
    }

}
