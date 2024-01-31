// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarOrderListQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CarOrderListQueryResponseBody body;

    public static CarOrderListQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CarOrderListQueryResponse self = new CarOrderListQueryResponse();
        return TeaModel.build(map, self);
    }

    public CarOrderListQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CarOrderListQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CarOrderListQueryResponse setBody(CarOrderListQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CarOrderListQueryResponseBody getBody() {
        return this.body;
    }

}
