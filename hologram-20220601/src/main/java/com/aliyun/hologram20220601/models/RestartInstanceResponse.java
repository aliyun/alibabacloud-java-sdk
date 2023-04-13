// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RestartInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestartInstanceResponseBody body;

    public static RestartInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceResponse self = new RestartInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartInstanceResponse setBody(RestartInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartInstanceResponseBody getBody() {
        return this.body;
    }

}
