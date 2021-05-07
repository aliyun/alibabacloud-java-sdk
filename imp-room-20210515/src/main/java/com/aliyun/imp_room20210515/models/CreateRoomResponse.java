// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class CreateRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRoomResponseBody body;

    public static CreateRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomResponse self = new CreateRoomResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoomResponse setBody(CreateRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoomResponseBody getBody() {
        return this.body;
    }

}
