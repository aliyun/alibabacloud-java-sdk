// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchSimilarArticlesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSearchSimilarArticlesResponseBody body;

    public static RunSearchSimilarArticlesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSearchSimilarArticlesResponse self = new RunSearchSimilarArticlesResponse();
        return TeaModel.build(map, self);
    }

    public RunSearchSimilarArticlesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSearchSimilarArticlesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSearchSimilarArticlesResponse setBody(RunSearchSimilarArticlesResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSearchSimilarArticlesResponseBody getBody() {
        return this.body;
    }

}
