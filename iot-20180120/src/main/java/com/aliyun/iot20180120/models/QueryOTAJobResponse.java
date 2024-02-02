// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOTAJobResponseBody body;

    public static QueryOTAJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAJobResponse self = new QueryOTAJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryOTAJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOTAJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOTAJobResponse setBody(QueryOTAJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOTAJobResponseBody getBody() {
        return this.body;
    }

}
