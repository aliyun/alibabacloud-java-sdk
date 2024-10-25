// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class LaunchServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LaunchServiceResponseBody body;

    public static LaunchServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchServiceResponse self = new LaunchServiceResponse();
        return TeaModel.build(map, self);
    }

    public LaunchServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LaunchServiceResponse setBody(LaunchServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchServiceResponseBody getBody() {
        return this.body;
    }

}
