// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyModifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CarApplyModifyResponseBody body;

    public static CarApplyModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CarApplyModifyResponse self = new CarApplyModifyResponse();
        return TeaModel.build(map, self);
    }

    public CarApplyModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CarApplyModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CarApplyModifyResponse setBody(CarApplyModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CarApplyModifyResponseBody getBody() {
        return this.body;
    }

}
