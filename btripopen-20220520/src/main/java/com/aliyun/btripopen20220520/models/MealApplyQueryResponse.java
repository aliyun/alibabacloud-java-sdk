// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MealApplyQueryResponseBody body;

    public static MealApplyQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        MealApplyQueryResponse self = new MealApplyQueryResponse();
        return TeaModel.build(map, self);
    }

    public MealApplyQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MealApplyQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MealApplyQueryResponse setBody(MealApplyQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public MealApplyQueryResponseBody getBody() {
        return this.body;
    }

}
