// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealOrderDetailQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MealOrderDetailQueryResponseBody body;

    public static MealOrderDetailQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        MealOrderDetailQueryResponse self = new MealOrderDetailQueryResponse();
        return TeaModel.build(map, self);
    }

    public MealOrderDetailQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MealOrderDetailQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MealOrderDetailQueryResponse setBody(MealOrderDetailQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public MealOrderDetailQueryResponseBody getBody() {
        return this.body;
    }

}
