// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadJobByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecordDownloadJobByIdResponseBody body;

    public static QueryRecordDownloadJobByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadJobByIdResponse self = new QueryRecordDownloadJobByIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadJobByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordDownloadJobByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordDownloadJobByIdResponse setBody(QueryRecordDownloadJobByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordDownloadJobByIdResponseBody getBody() {
        return this.body;
    }

}
