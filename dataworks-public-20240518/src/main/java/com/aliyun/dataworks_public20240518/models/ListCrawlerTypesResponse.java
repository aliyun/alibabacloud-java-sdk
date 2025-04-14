// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlerTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCrawlerTypesResponseBody body;

    public static ListCrawlerTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlerTypesResponse self = new ListCrawlerTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListCrawlerTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrawlerTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrawlerTypesResponse setBody(ListCrawlerTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrawlerTypesResponseBody getBody() {
        return this.body;
    }

}
