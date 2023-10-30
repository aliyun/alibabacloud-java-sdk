// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecordDownloadJobListResponseBody body;

    public static QueryRecordDownloadJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadJobListResponse self = new QueryRecordDownloadJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordDownloadJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordDownloadJobListResponse setBody(QueryRecordDownloadJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordDownloadJobListResponseBody getBody() {
        return this.body;
    }

}
