// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CarApplyQueryResponseBody body;

    public static CarApplyQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CarApplyQueryResponse self = new CarApplyQueryResponse();
        return TeaModel.build(map, self);
    }

    public CarApplyQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CarApplyQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CarApplyQueryResponse setBody(CarApplyQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CarApplyQueryResponseBody getBody() {
        return this.body;
    }

}
