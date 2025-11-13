// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchRecursionZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchRecursionZonesResponseBody body;

    public static SearchRecursionZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchRecursionZonesResponse self = new SearchRecursionZonesResponse();
        return TeaModel.build(map, self);
    }

    public SearchRecursionZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchRecursionZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchRecursionZonesResponse setBody(SearchRecursionZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchRecursionZonesResponseBody getBody() {
        return this.body;
    }

}
