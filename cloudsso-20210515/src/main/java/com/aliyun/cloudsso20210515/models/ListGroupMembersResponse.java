// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupMembersResponseBody body;

    public static ListGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupMembersResponse self = new ListGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupMembersResponse setBody(ListGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupMembersResponseBody getBody() {
        return this.body;
    }

}
