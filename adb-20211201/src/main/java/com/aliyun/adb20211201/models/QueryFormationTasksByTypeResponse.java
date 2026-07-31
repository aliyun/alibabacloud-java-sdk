// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryFormationTasksByTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFormationTasksByTypeResponseBody body;

    public static QueryFormationTasksByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFormationTasksByTypeResponse self = new QueryFormationTasksByTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryFormationTasksByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFormationTasksByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFormationTasksByTypeResponse setBody(QueryFormationTasksByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFormationTasksByTypeResponseBody getBody() {
        return this.body;
    }

}
