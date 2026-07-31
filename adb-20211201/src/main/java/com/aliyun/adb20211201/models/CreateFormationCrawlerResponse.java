// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateFormationCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFormationCrawlerResponseBody body;

    public static CreateFormationCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFormationCrawlerResponse self = new CreateFormationCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public CreateFormationCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFormationCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFormationCrawlerResponse setBody(CreateFormationCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFormationCrawlerResponseBody getBody() {
        return this.body;
    }

}
