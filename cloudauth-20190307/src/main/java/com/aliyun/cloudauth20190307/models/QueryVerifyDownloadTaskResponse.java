// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyDownloadTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVerifyDownloadTaskResponseBody body;

    public static QueryVerifyDownloadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyDownloadTaskResponse self = new QueryVerifyDownloadTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryVerifyDownloadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVerifyDownloadTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVerifyDownloadTaskResponse setBody(QueryVerifyDownloadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVerifyDownloadTaskResponseBody getBody() {
        return this.body;
    }

}
