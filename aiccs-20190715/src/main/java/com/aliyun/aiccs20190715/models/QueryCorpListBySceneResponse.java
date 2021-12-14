// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryCorpListBySceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCorpListBySceneResponseBody body;

    public static QueryCorpListBySceneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpListBySceneResponse self = new QueryCorpListBySceneResponse();
        return TeaModel.build(map, self);
    }

    public QueryCorpListBySceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCorpListBySceneResponse setBody(QueryCorpListBySceneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCorpListBySceneResponseBody getBody() {
        return this.body;
    }

}
