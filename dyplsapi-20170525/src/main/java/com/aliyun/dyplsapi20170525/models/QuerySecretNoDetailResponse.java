// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySecretNoDetailResponseBody body;

    public static QuerySecretNoDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoDetailResponse self = new QuerySecretNoDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySecretNoDetailResponse setBody(QuerySecretNoDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySecretNoDetailResponseBody getBody() {
        return this.body;
    }

}
