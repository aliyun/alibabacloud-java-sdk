// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QuerySensNodeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySensNodeInfoResponseBody body;

    public static QuerySensNodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySensNodeInfoResponse self = new QuerySensNodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySensNodeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySensNodeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySensNodeInfoResponse setBody(QuerySensNodeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySensNodeInfoResponseBody getBody() {
        return this.body;
    }

}
