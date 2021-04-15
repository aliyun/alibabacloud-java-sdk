// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class ListGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupResponseBody body;

    public static ListGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupResponse self = new ListGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupResponse setBody(ListGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupResponseBody getBody() {
        return this.body;
    }

}
