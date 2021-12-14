// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListRoomUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRoomUsersResponseBody body;

    public static ListRoomUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoomUsersResponse self = new ListRoomUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListRoomUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoomUsersResponse setBody(ListRoomUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoomUsersResponseBody getBody() {
        return this.body;
    }

}
