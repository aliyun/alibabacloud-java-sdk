// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlerRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCrawlerRunsResponseBody body;

    public static ListCrawlerRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlerRunsResponse self = new ListCrawlerRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListCrawlerRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrawlerRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrawlerRunsResponse setBody(ListCrawlerRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrawlerRunsResponseBody getBody() {
        return this.body;
    }

}
