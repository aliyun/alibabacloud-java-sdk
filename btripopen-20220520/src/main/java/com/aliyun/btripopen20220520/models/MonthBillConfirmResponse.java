// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillConfirmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MonthBillConfirmResponseBody body;

    public static MonthBillConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        MonthBillConfirmResponse self = new MonthBillConfirmResponse();
        return TeaModel.build(map, self);
    }

    public MonthBillConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MonthBillConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MonthBillConfirmResponse setBody(MonthBillConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public MonthBillConfirmResponseBody getBody() {
        return this.body;
    }

}
