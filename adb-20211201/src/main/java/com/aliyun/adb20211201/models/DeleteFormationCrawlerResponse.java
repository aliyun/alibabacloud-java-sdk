// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteFormationCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFormationCrawlerResponseBody body;

    public static DeleteFormationCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFormationCrawlerResponse self = new DeleteFormationCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFormationCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFormationCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFormationCrawlerResponse setBody(DeleteFormationCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFormationCrawlerResponseBody getBody() {
        return this.body;
    }

}
