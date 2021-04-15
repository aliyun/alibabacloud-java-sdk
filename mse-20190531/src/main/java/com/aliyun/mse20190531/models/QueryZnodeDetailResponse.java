// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryZnodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryZnodeDetailResponseBody body;

    public static QueryZnodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryZnodeDetailResponse self = new QueryZnodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryZnodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryZnodeDetailResponse setBody(QueryZnodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryZnodeDetailResponseBody getBody() {
        return this.body;
    }

}
