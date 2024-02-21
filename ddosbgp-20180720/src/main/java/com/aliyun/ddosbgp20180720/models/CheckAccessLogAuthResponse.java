// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckAccessLogAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAccessLogAuthResponseBody body;

    public static CheckAccessLogAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccessLogAuthResponse self = new CheckAccessLogAuthResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccessLogAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccessLogAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAccessLogAuthResponse setBody(CheckAccessLogAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccessLogAuthResponseBody getBody() {
        return this.body;
    }

}
