// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ModelTypeDetermineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelTypeDetermineResponseBody body;

    public static ModelTypeDetermineResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelTypeDetermineResponse self = new ModelTypeDetermineResponse();
        return TeaModel.build(map, self);
    }

    public ModelTypeDetermineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelTypeDetermineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelTypeDetermineResponse setBody(ModelTypeDetermineResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelTypeDetermineResponseBody getBody() {
        return this.body;
    }

}
