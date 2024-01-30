// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecurityGroupConfigurationResponseBody body;

    public static ModifySecurityGroupConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupConfigurationResponse self = new ModifySecurityGroupConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityGroupConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityGroupConfigurationResponse setBody(ModifySecurityGroupConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupConfigurationResponseBody getBody() {
        return this.body;
    }

}
