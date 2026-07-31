// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryFormationTaskByIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFormationTaskByIDResponseBody body;

    public static QueryFormationTaskByIDResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFormationTaskByIDResponse self = new QueryFormationTaskByIDResponse();
        return TeaModel.build(map, self);
    }

    public QueryFormationTaskByIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFormationTaskByIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFormationTaskByIDResponse setBody(QueryFormationTaskByIDResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFormationTaskByIDResponseBody getBody() {
        return this.body;
    }

}
