// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealOrderListQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MealOrderListQueryResponseBody body;

    public static MealOrderListQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        MealOrderListQueryResponse self = new MealOrderListQueryResponse();
        return TeaModel.build(map, self);
    }

    public MealOrderListQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MealOrderListQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MealOrderListQueryResponse setBody(MealOrderListQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public MealOrderListQueryResponseBody getBody() {
        return this.body;
    }

}
