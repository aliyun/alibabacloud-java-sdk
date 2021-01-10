// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderDetailInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderDetailInnerResponseBody body;

    public static QueryOrderDetailInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderDetailInnerResponse self = new QueryOrderDetailInnerResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderDetailInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderDetailInnerResponse setBody(QueryOrderDetailInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderDetailInnerResponseBody getBody() {
        return this.body;
    }

}
