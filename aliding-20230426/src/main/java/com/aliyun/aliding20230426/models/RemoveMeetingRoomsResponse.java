// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveMeetingRoomsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveMeetingRoomsResponseBody body;

    public static RemoveMeetingRoomsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveMeetingRoomsResponse self = new RemoveMeetingRoomsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveMeetingRoomsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveMeetingRoomsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveMeetingRoomsResponse setBody(RemoveMeetingRoomsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveMeetingRoomsResponseBody getBody() {
        return this.body;
    }

}
