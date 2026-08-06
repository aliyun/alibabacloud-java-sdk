// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCrawlerResponseBody body;

    public static GetCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrawlerResponse self = new GetCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public GetCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrawlerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrawlerResponse setBody(GetCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrawlerResponseBody getBody() {
        return this.body;
    }

}
