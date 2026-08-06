// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCrawlerResponseBody body;

    public static StopCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCrawlerResponse self = new StopCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public StopCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCrawlerResponse setBody(StopCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCrawlerResponseBody getBody() {
        return this.body;
    }

}
