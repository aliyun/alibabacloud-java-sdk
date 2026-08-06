// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCrawlerResponseBody body;

    public static UpdateCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrawlerResponse self = new UpdateCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCrawlerResponse setBody(UpdateCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCrawlerResponseBody getBody() {
        return this.body;
    }

}
