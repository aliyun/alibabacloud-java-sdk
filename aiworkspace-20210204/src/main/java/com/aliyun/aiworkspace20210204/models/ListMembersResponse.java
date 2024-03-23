// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMembersResponseBody body;

    public static ListMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMembersResponse self = new ListMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMembersResponse setBody(ListMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMembersResponseBody getBody() {
        return this.body;
    }

}
