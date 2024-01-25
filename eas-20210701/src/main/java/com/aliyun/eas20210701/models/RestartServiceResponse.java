// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class RestartServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartServiceResponseBody body;

    public static RestartServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartServiceResponse self = new RestartServiceResponse();
        return TeaModel.build(map, self);
    }

    public RestartServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartServiceResponse setBody(RestartServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartServiceResponseBody getBody() {
        return this.body;
    }

}
