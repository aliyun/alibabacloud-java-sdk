// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMediaSettleInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaSettleInfoResponseBody body;

    public static QueryMediaSettleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaSettleInfoResponse self = new QueryMediaSettleInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaSettleInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaSettleInfoResponse setBody(QueryMediaSettleInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaSettleInfoResponseBody getBody() {
        return this.body;
    }

}
