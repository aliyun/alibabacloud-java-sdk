// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceNameResponseBody body;

    public static UpdateInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNameResponse self = new UpdateInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceNameResponse setBody(UpdateInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceNameResponseBody getBody() {
        return this.body;
    }

}
