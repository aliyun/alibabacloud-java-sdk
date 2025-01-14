// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteApprovalProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApprovalProcessesResponseBody body;

    public static DeleteApprovalProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApprovalProcessesResponse self = new DeleteApprovalProcessesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApprovalProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApprovalProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApprovalProcessesResponse setBody(DeleteApprovalProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApprovalProcessesResponseBody getBody() {
        return this.body;
    }

}
