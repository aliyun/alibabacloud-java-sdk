// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryVideoCognitionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVideoCognitionJobResponseBody body;

    public static QueryVideoCognitionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoCognitionJobResponse self = new QueryVideoCognitionJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideoCognitionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVideoCognitionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVideoCognitionJobResponse setBody(QueryVideoCognitionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVideoCognitionJobResponseBody getBody() {
        return this.body;
    }

}
