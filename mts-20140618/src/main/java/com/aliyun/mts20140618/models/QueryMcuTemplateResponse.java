// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMcuTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMcuTemplateResponseBody body;

    public static QueryMcuTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcuTemplateResponse self = new QueryMcuTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcuTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcuTemplateResponse setBody(QueryMcuTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcuTemplateResponseBody getBody() {
        return this.body;
    }

}
