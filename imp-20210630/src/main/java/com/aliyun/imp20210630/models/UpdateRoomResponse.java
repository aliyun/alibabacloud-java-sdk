// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRoomResponseBody body;

    public static UpdateRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoomResponse self = new UpdateRoomResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRoomResponse setBody(UpdateRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRoomResponseBody getBody() {
        return this.body;
    }

}
