// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryK8sClusterLogProjectInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryK8sClusterLogProjectInfoResponseBody body;

    public static QueryK8sClusterLogProjectInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryK8sClusterLogProjectInfoResponse self = new QueryK8sClusterLogProjectInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryK8sClusterLogProjectInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryK8sClusterLogProjectInfoResponse setBody(QueryK8sClusterLogProjectInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryK8sClusterLogProjectInfoResponseBody getBody() {
        return this.body;
    }

}
