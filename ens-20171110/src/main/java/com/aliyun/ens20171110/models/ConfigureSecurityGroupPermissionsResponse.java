// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ConfigureSecurityGroupPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigureSecurityGroupPermissionsResponseBody body;

    public static ConfigureSecurityGroupPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSecurityGroupPermissionsResponse self = new ConfigureSecurityGroupPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSecurityGroupPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSecurityGroupPermissionsResponse setBody(ConfigureSecurityGroupPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSecurityGroupPermissionsResponseBody getBody() {
        return this.body;
    }

}
