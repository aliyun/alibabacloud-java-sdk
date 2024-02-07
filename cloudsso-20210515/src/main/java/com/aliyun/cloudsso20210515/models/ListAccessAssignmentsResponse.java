// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessAssignmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessAssignmentsResponseBody body;

    public static ListAccessAssignmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessAssignmentsResponse self = new ListAccessAssignmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessAssignmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessAssignmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessAssignmentsResponse setBody(ListAccessAssignmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessAssignmentsResponseBody getBody() {
        return this.body;
    }

}
