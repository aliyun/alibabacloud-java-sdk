// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QuerySensLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySensLevelResponseBody body;

    public static QuerySensLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySensLevelResponse self = new QuerySensLevelResponse();
        return TeaModel.build(map, self);
    }

    public QuerySensLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySensLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySensLevelResponse setBody(QuerySensLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySensLevelResponseBody getBody() {
        return this.body;
    }

}
