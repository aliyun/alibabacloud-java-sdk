// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCrawlersResponseBody body;

    public static ListCrawlersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlersResponse self = new ListCrawlersResponse();
        return TeaModel.build(map, self);
    }

    public ListCrawlersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrawlersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrawlersResponse setBody(ListCrawlersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrawlersResponseBody getBody() {
        return this.body;
    }

}
