// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDynamicConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDynamicConfigResponseBody body;

    public static ModifyDynamicConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDynamicConfigResponse self = new ModifyDynamicConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDynamicConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDynamicConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDynamicConfigResponse setBody(ModifyDynamicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDynamicConfigResponseBody getBody() {
        return this.body;
    }

}
