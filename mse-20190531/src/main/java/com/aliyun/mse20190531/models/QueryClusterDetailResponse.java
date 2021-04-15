// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryClusterDetailResponseBody body;

    public static QueryClusterDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDetailResponse self = new QueryClusterDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryClusterDetailResponse setBody(QueryClusterDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryClusterDetailResponseBody getBody() {
        return this.body;
    }

}
