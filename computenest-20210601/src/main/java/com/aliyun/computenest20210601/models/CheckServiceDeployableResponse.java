// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CheckServiceDeployableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckServiceDeployableResponseBody body;

    public static CheckServiceDeployableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceDeployableResponse self = new CheckServiceDeployableResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceDeployableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceDeployableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceDeployableResponse setBody(CheckServiceDeployableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceDeployableResponseBody getBody() {
        return this.body;
    }

}
