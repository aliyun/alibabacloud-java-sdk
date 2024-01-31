// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillGetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MonthBillGetResponseBody body;

    public static MonthBillGetResponse build(java.util.Map<String, ?> map) throws Exception {
        MonthBillGetResponse self = new MonthBillGetResponse();
        return TeaModel.build(map, self);
    }

    public MonthBillGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MonthBillGetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MonthBillGetResponse setBody(MonthBillGetResponseBody body) {
        this.body = body;
        return this;
    }
    public MonthBillGetResponseBody getBody() {
        return this.body;
    }

}
