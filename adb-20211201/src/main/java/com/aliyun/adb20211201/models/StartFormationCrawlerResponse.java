// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartFormationCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartFormationCrawlerResponseBody body;

    public static StartFormationCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartFormationCrawlerResponse self = new StartFormationCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public StartFormationCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartFormationCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartFormationCrawlerResponse setBody(StartFormationCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartFormationCrawlerResponseBody getBody() {
        return this.body;
    }

}
