// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryCorpNameListFor400Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCorpNameListFor400ResponseBody body;

    public static QueryCorpNameListFor400Response build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpNameListFor400Response self = new QueryCorpNameListFor400Response();
        return TeaModel.build(map, self);
    }

    public QueryCorpNameListFor400Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCorpNameListFor400Response setBody(QueryCorpNameListFor400ResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCorpNameListFor400ResponseBody getBody() {
        return this.body;
    }

}
