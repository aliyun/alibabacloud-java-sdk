// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
