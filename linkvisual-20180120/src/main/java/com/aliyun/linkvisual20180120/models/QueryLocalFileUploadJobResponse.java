// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLocalFileUploadJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLocalFileUploadJobResponseBody body;

    public static QueryLocalFileUploadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLocalFileUploadJobResponse self = new QueryLocalFileUploadJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryLocalFileUploadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLocalFileUploadJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLocalFileUploadJobResponse setBody(QueryLocalFileUploadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLocalFileUploadJobResponseBody getBody() {
        return this.body;
    }

}
