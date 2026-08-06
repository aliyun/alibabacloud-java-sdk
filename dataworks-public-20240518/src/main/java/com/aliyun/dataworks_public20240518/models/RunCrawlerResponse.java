// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RunCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunCrawlerResponseBody body;

    public static RunCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCrawlerResponse self = new RunCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public RunCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunCrawlerResponse setBody(RunCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCrawlerResponseBody getBody() {
        return this.body;
    }

}
