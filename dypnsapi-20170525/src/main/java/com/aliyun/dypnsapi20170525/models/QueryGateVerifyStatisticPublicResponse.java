// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QueryGateVerifyStatisticPublicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGateVerifyStatisticPublicResponseBody body;

    public static QueryGateVerifyStatisticPublicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyStatisticPublicResponse self = new QueryGateVerifyStatisticPublicResponse();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyStatisticPublicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGateVerifyStatisticPublicResponse setBody(QueryGateVerifyStatisticPublicResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGateVerifyStatisticPublicResponseBody getBody() {
        return this.body;
    }

}
