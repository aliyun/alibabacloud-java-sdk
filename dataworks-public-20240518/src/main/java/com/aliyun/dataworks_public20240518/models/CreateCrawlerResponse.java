// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCrawlerResponseBody body;

    public static CreateCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCrawlerResponse self = new CreateCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public CreateCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCrawlerResponse setBody(CreateCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCrawlerResponseBody getBody() {
        return this.body;
    }

}
