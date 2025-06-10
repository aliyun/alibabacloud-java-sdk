// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcBMDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CalcBMDResponseBody body;

    public static CalcBMDResponse build(java.util.Map<String, ?> map) throws Exception {
        CalcBMDResponse self = new CalcBMDResponse();
        return TeaModel.build(map, self);
    }

    public CalcBMDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalcBMDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CalcBMDResponse setBody(CalcBMDResponseBody body) {
        this.body = body;
        return this;
    }
    public CalcBMDResponseBody getBody() {
        return this.body;
    }

}
