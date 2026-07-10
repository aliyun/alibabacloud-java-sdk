// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthPreBillGetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MonthPreBillGetResponseBody body;

    public static MonthPreBillGetResponse build(java.util.Map<String, ?> map) throws Exception {
        MonthPreBillGetResponse self = new MonthPreBillGetResponse();
        return TeaModel.build(map, self);
    }

    public MonthPreBillGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MonthPreBillGetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MonthPreBillGetResponse setBody(MonthPreBillGetResponseBody body) {
        this.body = body;
        return this;
    }
    public MonthPreBillGetResponseBody getBody() {
        return this.body;
    }

}
