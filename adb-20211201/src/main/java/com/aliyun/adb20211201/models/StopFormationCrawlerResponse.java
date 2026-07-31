// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StopFormationCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopFormationCrawlerResponseBody body;

    public static StopFormationCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopFormationCrawlerResponse self = new StopFormationCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public StopFormationCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopFormationCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopFormationCrawlerResponse setBody(StopFormationCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopFormationCrawlerResponseBody getBody() {
        return this.body;
    }

}
