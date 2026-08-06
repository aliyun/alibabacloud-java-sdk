// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCrawlerResponseBody body;

    public static DeleteCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCrawlerResponse self = new DeleteCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCrawlerResponse setBody(DeleteCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCrawlerResponseBody getBody() {
        return this.body;
    }

}
