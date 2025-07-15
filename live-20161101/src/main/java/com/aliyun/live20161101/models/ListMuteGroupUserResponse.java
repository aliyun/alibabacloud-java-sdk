// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMuteGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMuteGroupUserResponseBody body;

    public static ListMuteGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMuteGroupUserResponse self = new ListMuteGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public ListMuteGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMuteGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMuteGroupUserResponse setBody(ListMuteGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMuteGroupUserResponseBody getBody() {
        return this.body;
    }

}
