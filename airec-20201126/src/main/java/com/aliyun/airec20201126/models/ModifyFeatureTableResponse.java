// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyFeatureTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFeatureTableResponseBody body;

    public static ModifyFeatureTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFeatureTableResponse self = new ModifyFeatureTableResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFeatureTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFeatureTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFeatureTableResponse setBody(ModifyFeatureTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFeatureTableResponseBody getBody() {
        return this.body;
    }

}
