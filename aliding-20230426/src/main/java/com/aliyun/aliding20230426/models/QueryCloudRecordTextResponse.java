// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCloudRecordTextResponseBody body;

    public static QueryCloudRecordTextResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordTextResponse self = new QueryCloudRecordTextResponse();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCloudRecordTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCloudRecordTextResponse setBody(QueryCloudRecordTextResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCloudRecordTextResponseBody getBody() {
        return this.body;
    }

}
