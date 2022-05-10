// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class PublishLiveRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishLiveRoomResponseBody body;

    public static PublishLiveRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveRoomResponse self = new PublishLiveRoomResponse();
        return TeaModel.build(map, self);
    }

    public PublishLiveRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishLiveRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishLiveRoomResponse setBody(PublishLiveRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishLiveRoomResponseBody getBody() {
        return this.body;
    }

}
