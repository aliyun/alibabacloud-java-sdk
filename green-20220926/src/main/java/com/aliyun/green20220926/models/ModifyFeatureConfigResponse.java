// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyFeatureConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFeatureConfigResponseBody body;

    public static ModifyFeatureConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFeatureConfigResponse self = new ModifyFeatureConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFeatureConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFeatureConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFeatureConfigResponse setBody(ModifyFeatureConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFeatureConfigResponseBody getBody() {
        return this.body;
    }

}
