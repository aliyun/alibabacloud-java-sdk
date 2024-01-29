// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListGroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupMemberResponse setBody(ListGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupMemberResponseBody getBody() {
        return this.body;
    }

}
