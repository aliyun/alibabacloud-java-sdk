// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateAppKeyStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppKeyStateResponseBody body;

    public static UpdateAppKeyStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppKeyStateResponse self = new UpdateAppKeyStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppKeyStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppKeyStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppKeyStateResponse setBody(UpdateAppKeyStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppKeyStateResponseBody getBody() {
        return this.body;
    }

}
