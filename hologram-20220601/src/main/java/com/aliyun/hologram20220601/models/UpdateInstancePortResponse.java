// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateInstancePortResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstancePortResponseBody body;

    public static UpdateInstancePortResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstancePortResponse self = new UpdateInstancePortResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstancePortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstancePortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstancePortResponse setBody(UpdateInstancePortResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstancePortResponseBody getBody() {
        return this.body;
    }

}
