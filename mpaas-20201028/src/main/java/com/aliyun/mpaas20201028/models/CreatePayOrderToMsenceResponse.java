// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreatePayOrderToMsenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePayOrderToMsenceResponseBody body;

    public static CreatePayOrderToMsenceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePayOrderToMsenceResponse self = new CreatePayOrderToMsenceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePayOrderToMsenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePayOrderToMsenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePayOrderToMsenceResponse setBody(CreatePayOrderToMsenceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePayOrderToMsenceResponseBody getBody() {
        return this.body;
    }

}
