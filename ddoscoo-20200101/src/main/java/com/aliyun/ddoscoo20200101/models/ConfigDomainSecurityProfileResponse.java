// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigDomainSecurityProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigDomainSecurityProfileResponseBody body;

    public static ConfigDomainSecurityProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigDomainSecurityProfileResponse self = new ConfigDomainSecurityProfileResponse();
        return TeaModel.build(map, self);
    }

    public ConfigDomainSecurityProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigDomainSecurityProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigDomainSecurityProfileResponse setBody(ConfigDomainSecurityProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigDomainSecurityProfileResponseBody getBody() {
        return this.body;
    }

}
