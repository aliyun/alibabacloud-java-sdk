// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CheckRawPlanJsonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckRawPlanJsonResponseBody body;

    public static CheckRawPlanJsonResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRawPlanJsonResponse self = new CheckRawPlanJsonResponse();
        return TeaModel.build(map, self);
    }

    public CheckRawPlanJsonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRawPlanJsonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckRawPlanJsonResponse setBody(CheckRawPlanJsonResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRawPlanJsonResponseBody getBody() {
        return this.body;
    }

}
