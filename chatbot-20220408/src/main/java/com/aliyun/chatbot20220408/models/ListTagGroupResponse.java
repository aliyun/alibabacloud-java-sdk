// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagGroupResponseBody body;

    public static ListTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagGroupResponse self = new ListTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagGroupResponse setBody(ListTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagGroupResponseBody getBody() {
        return this.body;
    }

}
