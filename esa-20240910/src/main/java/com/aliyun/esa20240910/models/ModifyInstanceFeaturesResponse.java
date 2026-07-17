// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ModifyInstanceFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceFeaturesResponseBody body;

    public static ModifyInstanceFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceFeaturesResponse self = new ModifyInstanceFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceFeaturesResponse setBody(ModifyInstanceFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceFeaturesResponseBody getBody() {
        return this.body;
    }

}
