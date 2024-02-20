// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class QueryTagByParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryTagByParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagByParamResponse setBody(QueryTagByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagByParamResponseBody getBody() {
        return this.body;
    }

}
