// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetFormationCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFormationCrawlerResponseBody body;

    public static GetFormationCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFormationCrawlerResponse self = new GetFormationCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public GetFormationCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFormationCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFormationCrawlerResponse setBody(GetFormationCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFormationCrawlerResponseBody getBody() {
        return this.body;
    }

}
