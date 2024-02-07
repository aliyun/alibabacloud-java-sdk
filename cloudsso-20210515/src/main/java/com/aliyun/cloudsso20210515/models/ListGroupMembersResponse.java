// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupMembersResponse setBody(ListGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupMembersResponseBody getBody() {
        return this.body;
    }

}
