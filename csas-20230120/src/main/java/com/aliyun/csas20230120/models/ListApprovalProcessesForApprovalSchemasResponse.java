// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalProcessesForApprovalSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApprovalProcessesForApprovalSchemasResponseBody body;

    public static ListApprovalProcessesForApprovalSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalProcessesForApprovalSchemasResponse self = new ListApprovalProcessesForApprovalSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListApprovalProcessesForApprovalSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApprovalProcessesForApprovalSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApprovalProcessesForApprovalSchemasResponse setBody(ListApprovalProcessesForApprovalSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApprovalProcessesForApprovalSchemasResponseBody getBody() {
        return this.body;
    }

}
