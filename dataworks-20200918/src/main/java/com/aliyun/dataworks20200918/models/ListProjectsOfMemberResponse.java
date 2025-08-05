// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListProjectsOfMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectsOfMemberResponseBody body;

    public static ListProjectsOfMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsOfMemberResponse self = new ListProjectsOfMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsOfMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectsOfMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectsOfMemberResponse setBody(ListProjectsOfMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectsOfMemberResponseBody getBody() {
        return this.body;
    }

}
