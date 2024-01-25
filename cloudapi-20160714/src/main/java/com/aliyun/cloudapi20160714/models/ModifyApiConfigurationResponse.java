// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApiConfigurationResponseBody body;

    public static ModifyApiConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiConfigurationResponse self = new ModifyApiConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApiConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApiConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApiConfigurationResponse setBody(ModifyApiConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiConfigurationResponseBody getBody() {
        return this.body;
    }

}
