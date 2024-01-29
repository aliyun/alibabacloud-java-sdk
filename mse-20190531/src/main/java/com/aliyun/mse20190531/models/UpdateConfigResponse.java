// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigResponseBody body;

    public static UpdateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigResponse self = new UpdateConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigResponse setBody(UpdateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigResponseBody getBody() {
        return this.body;
    }

}
