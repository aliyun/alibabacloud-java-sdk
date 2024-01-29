// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListResourceMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceMembersResponseBody body;

    public static ListResourceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceMembersResponse self = new ListResourceMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceMembersResponse setBody(ListResourceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceMembersResponseBody getBody() {
        return this.body;
    }

}
