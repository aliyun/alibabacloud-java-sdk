// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarSceneQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CarSceneQueryResponseBody body;

    public static CarSceneQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CarSceneQueryResponse self = new CarSceneQueryResponse();
        return TeaModel.build(map, self);
    }

    public CarSceneQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CarSceneQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CarSceneQueryResponse setBody(CarSceneQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CarSceneQueryResponseBody getBody() {
        return this.body;
    }

}
