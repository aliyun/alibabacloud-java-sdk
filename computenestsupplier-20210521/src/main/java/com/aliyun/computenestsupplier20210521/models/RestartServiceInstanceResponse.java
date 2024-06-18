// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RestartServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartServiceInstanceResponseBody body;

    public static RestartServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartServiceInstanceResponse self = new RestartServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartServiceInstanceResponse setBody(RestartServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
