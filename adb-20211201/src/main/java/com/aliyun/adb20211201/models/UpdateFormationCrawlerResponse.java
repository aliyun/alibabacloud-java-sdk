// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateFormationCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFormationCrawlerResponseBody body;

    public static UpdateFormationCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFormationCrawlerResponse self = new UpdateFormationCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFormationCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFormationCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFormationCrawlerResponse setBody(UpdateFormationCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFormationCrawlerResponseBody getBody() {
        return this.body;
    }

}
