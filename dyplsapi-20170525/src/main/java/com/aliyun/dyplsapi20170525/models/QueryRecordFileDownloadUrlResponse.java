// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRecordFileDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecordFileDownloadUrlResponseBody body;

    public static QueryRecordFileDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordFileDownloadUrlResponse self = new QueryRecordFileDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordFileDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordFileDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordFileDownloadUrlResponse setBody(QueryRecordFileDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordFileDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
