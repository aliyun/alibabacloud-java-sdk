// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterAuditProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterAuditProjectResponseBody body;

    public static GetClusterAuditProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAuditProjectResponse self = new GetClusterAuditProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterAuditProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterAuditProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterAuditProjectResponse setBody(GetClusterAuditProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterAuditProjectResponseBody getBody() {
        return this.body;
    }

}
