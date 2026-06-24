// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class UpdateOpenSourcePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOpenSourcePermissionResponseBody body;

    public static UpdateOpenSourcePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpenSourcePermissionResponse self = new UpdateOpenSourcePermissionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOpenSourcePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOpenSourcePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOpenSourcePermissionResponse setBody(UpdateOpenSourcePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOpenSourcePermissionResponseBody getBody() {
        return this.body;
    }

}
