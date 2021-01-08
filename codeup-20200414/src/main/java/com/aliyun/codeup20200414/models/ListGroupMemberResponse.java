// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupMemberResponseBody body;

    public static ListGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupMemberResponse self = new ListGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupMemberResponse setBody(ListGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupMemberResponseBody getBody() {
        return this.body;
    }

}
