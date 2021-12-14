// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QuerySpecRegionByCorpNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySpecRegionByCorpNameResponseBody body;

    public static QuerySpecRegionByCorpNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpecRegionByCorpNameResponse self = new QuerySpecRegionByCorpNameResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpecRegionByCorpNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpecRegionByCorpNameResponse setBody(QuerySpecRegionByCorpNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpecRegionByCorpNameResponseBody getBody() {
        return this.body;
    }

}
