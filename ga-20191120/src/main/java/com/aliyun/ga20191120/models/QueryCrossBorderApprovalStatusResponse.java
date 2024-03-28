// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossBorderApprovalStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCrossBorderApprovalStatusResponseBody body;

    public static QueryCrossBorderApprovalStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCrossBorderApprovalStatusResponse self = new QueryCrossBorderApprovalStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryCrossBorderApprovalStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCrossBorderApprovalStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCrossBorderApprovalStatusResponse setBody(QueryCrossBorderApprovalStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCrossBorderApprovalStatusResponseBody getBody() {
        return this.body;
    }

}
