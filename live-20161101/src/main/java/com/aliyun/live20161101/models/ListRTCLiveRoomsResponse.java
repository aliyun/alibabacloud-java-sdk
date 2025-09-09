// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRTCLiveRoomsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRTCLiveRoomsResponseBody body;

    public static ListRTCLiveRoomsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRTCLiveRoomsResponse self = new ListRTCLiveRoomsResponse();
        return TeaModel.build(map, self);
    }

    public ListRTCLiveRoomsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRTCLiveRoomsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRTCLiveRoomsResponse setBody(ListRTCLiveRoomsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRTCLiveRoomsResponseBody getBody() {
        return this.body;
    }

}
