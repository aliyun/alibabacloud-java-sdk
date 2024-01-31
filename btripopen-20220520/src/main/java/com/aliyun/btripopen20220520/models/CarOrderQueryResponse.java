// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarOrderQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CarOrderQueryResponseBody body;

    public static CarOrderQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CarOrderQueryResponse self = new CarOrderQueryResponse();
        return TeaModel.build(map, self);
    }

    public CarOrderQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CarOrderQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CarOrderQueryResponse setBody(CarOrderQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CarOrderQueryResponseBody getBody() {
        return this.body;
    }

}
