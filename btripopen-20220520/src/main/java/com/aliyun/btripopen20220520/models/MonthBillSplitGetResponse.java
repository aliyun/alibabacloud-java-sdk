// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillSplitGetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MonthBillSplitGetResponseBody body;

    public static MonthBillSplitGetResponse build(java.util.Map<String, ?> map) throws Exception {
        MonthBillSplitGetResponse self = new MonthBillSplitGetResponse();
        return TeaModel.build(map, self);
    }

    public MonthBillSplitGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MonthBillSplitGetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MonthBillSplitGetResponse setBody(MonthBillSplitGetResponseBody body) {
        this.body = body;
        return this;
    }
    public MonthBillSplitGetResponseBody getBody() {
        return this.body;
    }

}
