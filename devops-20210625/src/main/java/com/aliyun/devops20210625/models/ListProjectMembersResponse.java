// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectMembersResponseBody body;

    public static ListProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersResponse self = new ListProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectMembersResponse setBody(ListProjectMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectMembersResponseBody getBody() {
        return this.body;
    }

}
