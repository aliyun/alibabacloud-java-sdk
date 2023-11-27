// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupAllMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupAllMembersResponseBody body;

    public static ListGroupAllMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupAllMembersResponse self = new ListGroupAllMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupAllMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupAllMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupAllMembersResponse setBody(ListGroupAllMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupAllMembersResponseBody getBody() {
        return this.body;
    }

}
