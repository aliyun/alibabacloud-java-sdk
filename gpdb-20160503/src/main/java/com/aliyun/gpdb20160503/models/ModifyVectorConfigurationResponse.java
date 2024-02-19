// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyVectorConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVectorConfigurationResponseBody body;

    public static ModifyVectorConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVectorConfigurationResponse self = new ModifyVectorConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVectorConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVectorConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVectorConfigurationResponse setBody(ModifyVectorConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVectorConfigurationResponseBody getBody() {
        return this.body;
    }

}
