// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryRealNameInfoByCorpNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRealNameInfoByCorpNameResponseBody body;

    public static QueryRealNameInfoByCorpNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRealNameInfoByCorpNameResponse self = new QueryRealNameInfoByCorpNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryRealNameInfoByCorpNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRealNameInfoByCorpNameResponse setBody(QueryRealNameInfoByCorpNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRealNameInfoByCorpNameResponseBody getBody() {
        return this.body;
    }

}
