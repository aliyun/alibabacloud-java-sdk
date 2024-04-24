// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QuerySensClassificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySensClassificationResponseBody body;

    public static QuerySensClassificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySensClassificationResponse self = new QuerySensClassificationResponse();
        return TeaModel.build(map, self);
    }

    public QuerySensClassificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySensClassificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySensClassificationResponse setBody(QuerySensClassificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySensClassificationResponseBody getBody() {
        return this.body;
    }

}
