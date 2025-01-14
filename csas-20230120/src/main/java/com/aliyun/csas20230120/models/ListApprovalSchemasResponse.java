// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApprovalSchemasResponseBody body;

    public static ListApprovalSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalSchemasResponse self = new ListApprovalSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListApprovalSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApprovalSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApprovalSchemasResponse setBody(ListApprovalSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApprovalSchemasResponseBody getBody() {
        return this.body;
    }

}
