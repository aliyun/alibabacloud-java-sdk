// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListRoleAssignmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoleAssignmentsResponseBody body;

    public static ListRoleAssignmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoleAssignmentsResponse self = new ListRoleAssignmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListRoleAssignmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoleAssignmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoleAssignmentsResponse setBody(ListRoleAssignmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoleAssignmentsResponseBody getBody() {
        return this.body;
    }

}
