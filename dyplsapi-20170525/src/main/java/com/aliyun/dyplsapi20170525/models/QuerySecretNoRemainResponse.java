// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoRemainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySecretNoRemainResponseBody body;

    public static QuerySecretNoRemainResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoRemainResponse self = new QuerySecretNoRemainResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoRemainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySecretNoRemainResponse setBody(QuerySecretNoRemainResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySecretNoRemainResponseBody getBody() {
        return this.body;
    }

}
