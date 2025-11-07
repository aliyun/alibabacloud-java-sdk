// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyFlowPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVerifyFlowPackageResponseBody body;

    public static QueryVerifyFlowPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyFlowPackageResponse self = new QueryVerifyFlowPackageResponse();
        return TeaModel.build(map, self);
    }

    public QueryVerifyFlowPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVerifyFlowPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVerifyFlowPackageResponse setBody(QueryVerifyFlowPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVerifyFlowPackageResponseBody getBody() {
        return this.body;
    }

}
