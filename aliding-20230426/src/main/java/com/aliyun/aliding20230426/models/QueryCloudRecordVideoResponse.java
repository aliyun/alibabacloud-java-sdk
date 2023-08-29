// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCloudRecordVideoResponseBody body;

    public static QueryCloudRecordVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoResponse self = new QueryCloudRecordVideoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCloudRecordVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCloudRecordVideoResponse setBody(QueryCloudRecordVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCloudRecordVideoResponseBody getBody() {
        return this.body;
    }

}
