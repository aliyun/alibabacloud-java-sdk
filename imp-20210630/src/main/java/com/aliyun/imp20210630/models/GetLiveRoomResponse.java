// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveRoomResponseBody body;

    public static GetLiveRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomResponse self = new GetLiveRoomResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveRoomResponse setBody(GetLiveRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveRoomResponseBody getBody() {
        return this.body;
    }

}
