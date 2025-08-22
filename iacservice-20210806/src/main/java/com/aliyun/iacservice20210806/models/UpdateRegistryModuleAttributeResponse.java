// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRegistryModuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRegistryModuleAttributeResponseBody body;

    public static UpdateRegistryModuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistryModuleAttributeResponse self = new UpdateRegistryModuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRegistryModuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRegistryModuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRegistryModuleAttributeResponse setBody(UpdateRegistryModuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRegistryModuleAttributeResponseBody getBody() {
        return this.body;
    }

}
