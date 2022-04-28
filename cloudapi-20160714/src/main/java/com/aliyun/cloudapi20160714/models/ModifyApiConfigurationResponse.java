// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyApiConfigurationResponse setBody(ModifyApiConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApiConfigurationResponseBody getBody() {
        return this.body;
    }

}
