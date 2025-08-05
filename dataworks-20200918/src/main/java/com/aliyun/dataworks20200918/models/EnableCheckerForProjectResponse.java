// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class EnableCheckerForProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCheckerForProjectResponseBody body;

    public static EnableCheckerForProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckerForProjectResponse self = new EnableCheckerForProjectResponse();
        return TeaModel.build(map, self);
    }

    public EnableCheckerForProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCheckerForProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCheckerForProjectResponse setBody(EnableCheckerForProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCheckerForProjectResponseBody getBody() {
        return this.body;
    }

}
