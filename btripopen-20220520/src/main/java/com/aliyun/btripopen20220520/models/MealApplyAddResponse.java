// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MealApplyAddResponseBody body;

    public static MealApplyAddResponse build(java.util.Map<String, ?> map) throws Exception {
        MealApplyAddResponse self = new MealApplyAddResponse();
        return TeaModel.build(map, self);
    }

    public MealApplyAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MealApplyAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MealApplyAddResponse setBody(MealApplyAddResponseBody body) {
        this.body = body;
        return this;
    }
    public MealApplyAddResponseBody getBody() {
        return this.body;
    }

}
