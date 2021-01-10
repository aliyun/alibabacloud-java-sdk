// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAgreementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAgreementResponseBody body;

    public static QueryAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgreementResponse self = new QueryAgreementResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgreementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAgreementResponse setBody(QueryAgreementResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAgreementResponseBody getBody() {
        return this.body;
    }

}
