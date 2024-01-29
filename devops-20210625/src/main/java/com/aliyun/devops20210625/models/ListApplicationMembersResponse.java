// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListApplicationMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationMembersResponseBody body;

    public static ListApplicationMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMembersResponse self = new ListApplicationMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationMembersResponse setBody(ListApplicationMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationMembersResponseBody getBody() {
        return this.body;
    }

}
