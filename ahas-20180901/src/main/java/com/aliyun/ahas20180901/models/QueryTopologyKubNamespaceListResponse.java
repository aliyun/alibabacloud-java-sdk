// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubNamespaceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyKubNamespaceListResponseBody body;

    public static QueryTopologyKubNamespaceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubNamespaceListResponse self = new QueryTopologyKubNamespaceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubNamespaceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyKubNamespaceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyKubNamespaceListResponse setBody(QueryTopologyKubNamespaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyKubNamespaceListResponseBody getBody() {
        return this.body;
    }

}
