// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecordDownloadUrlResponseBody body;

    public static QueryRecordDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadUrlResponse self = new QueryRecordDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordDownloadUrlResponse setBody(QueryRecordDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
