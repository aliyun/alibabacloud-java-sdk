// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CarApplyAddResponseBody body;

    public static CarApplyAddResponse build(java.util.Map<String, ?> map) throws Exception {
        CarApplyAddResponse self = new CarApplyAddResponse();
        return TeaModel.build(map, self);
    }

    public CarApplyAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CarApplyAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CarApplyAddResponse setBody(CarApplyAddResponseBody body) {
        this.body = body;
        return this;
    }
    public CarApplyAddResponseBody getBody() {
        return this.body;
    }

}
