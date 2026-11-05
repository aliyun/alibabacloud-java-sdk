// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationAssignmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationAssignmentsResponseBody body;

    public static ListApplicationAssignmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAssignmentsResponse self = new ListApplicationAssignmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationAssignmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationAssignmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationAssignmentsResponse setBody(ListApplicationAssignmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationAssignmentsResponseBody getBody() {
        return this.body;
    }

}
