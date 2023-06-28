// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteEduRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEduRoomResponseBody body;

    public static DeleteEduRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEduRoomResponse self = new DeleteEduRoomResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEduRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEduRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEduRoomResponse setBody(DeleteEduRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEduRoomResponseBody getBody() {
        return this.body;
    }

}
