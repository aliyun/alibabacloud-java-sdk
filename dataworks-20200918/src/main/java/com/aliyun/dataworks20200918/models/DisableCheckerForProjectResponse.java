// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DisableCheckerForProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCheckerForProjectResponseBody body;

    public static DisableCheckerForProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCheckerForProjectResponse self = new DisableCheckerForProjectResponse();
        return TeaModel.build(map, self);
    }

    public DisableCheckerForProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCheckerForProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCheckerForProjectResponse setBody(DisableCheckerForProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCheckerForProjectResponseBody getBody() {
        return this.body;
    }

}
