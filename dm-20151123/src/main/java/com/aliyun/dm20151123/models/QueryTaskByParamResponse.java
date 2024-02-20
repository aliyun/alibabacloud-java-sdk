// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTaskByParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTaskByParamResponseBody body;

    public static QueryTaskByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskByParamResponse self = new QueryTaskByParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskByParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskByParamResponse setBody(QueryTaskByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskByParamResponseBody getBody() {
        return this.body;
    }

}
