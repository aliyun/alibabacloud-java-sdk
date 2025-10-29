// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageScrapeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadPageScrapeResponseBody body;

    public static ReadPageScrapeResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadPageScrapeResponse self = new ReadPageScrapeResponse();
        return TeaModel.build(map, self);
    }

    public ReadPageScrapeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadPageScrapeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadPageScrapeResponse setBody(ReadPageScrapeResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadPageScrapeResponseBody getBody() {
        return this.body;
    }

}
