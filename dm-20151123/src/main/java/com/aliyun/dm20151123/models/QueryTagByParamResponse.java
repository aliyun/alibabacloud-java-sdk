// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTagByParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTagByParamResponseBody body;

    public static QueryTagByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagByParamResponse self = new QueryTagByParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagByParamResponse setBody(QueryTagByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagByParamResponseBody getBody() {
        return this.body;
    }

}
