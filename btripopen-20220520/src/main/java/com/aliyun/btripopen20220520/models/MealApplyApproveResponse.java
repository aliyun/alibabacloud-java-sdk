// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealApplyApproveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MealApplyApproveResponseBody body;

    public static MealApplyApproveResponse build(java.util.Map<String, ?> map) throws Exception {
        MealApplyApproveResponse self = new MealApplyApproveResponse();
        return TeaModel.build(map, self);
    }

    public MealApplyApproveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MealApplyApproveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MealApplyApproveResponse setBody(MealApplyApproveResponseBody body) {
        this.body = body;
        return this;
    }
    public MealApplyApproveResponseBody getBody() {
        return this.body;
    }

}
