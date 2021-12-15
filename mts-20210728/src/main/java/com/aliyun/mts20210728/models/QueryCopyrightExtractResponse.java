// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryCopyrightExtractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCopyrightExtractResponseBody body;

    public static QueryCopyrightExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightExtractResponse self = new QueryCopyrightExtractResponse();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCopyrightExtractResponse setBody(QueryCopyrightExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCopyrightExtractResponseBody getBody() {
        return this.body;
    }

}
