// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QuerySignByParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySignByParamResponseBody body;

    public static QuerySignByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySignByParamResponse self = new QuerySignByParamResponse();
        return TeaModel.build(map, self);
    }

    public QuerySignByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySignByParamResponse setBody(QuerySignByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySignByParamResponseBody getBody() {
        return this.body;
    }

}
