// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatGroupResponseBody body;

    public static ListChatGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatGroupResponse self = new ListChatGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListChatGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatGroupResponse setBody(ListChatGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatGroupResponseBody getBody() {
        return this.body;
    }

}
