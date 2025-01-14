// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalSchemasForApprovalProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApprovalSchemasForApprovalProcessesResponseBody body;

    public static ListApprovalSchemasForApprovalProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalSchemasForApprovalProcessesResponse self = new ListApprovalSchemasForApprovalProcessesResponse();
        return TeaModel.build(map, self);
    }

    public ListApprovalSchemasForApprovalProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApprovalSchemasForApprovalProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApprovalSchemasForApprovalProcessesResponse setBody(ListApprovalSchemasForApprovalProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApprovalSchemasForApprovalProcessesResponseBody getBody() {
        return this.body;
    }

}
