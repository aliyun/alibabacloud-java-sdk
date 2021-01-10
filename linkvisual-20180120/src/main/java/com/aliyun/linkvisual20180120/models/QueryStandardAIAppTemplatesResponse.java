// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStandardAIAppTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStandardAIAppTemplatesResponseBody body;

    public static QueryStandardAIAppTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardAIAppTemplatesResponse self = new QueryStandardAIAppTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public QueryStandardAIAppTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStandardAIAppTemplatesResponse setBody(QueryStandardAIAppTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStandardAIAppTemplatesResponseBody getBody() {
        return this.body;
    }

}
