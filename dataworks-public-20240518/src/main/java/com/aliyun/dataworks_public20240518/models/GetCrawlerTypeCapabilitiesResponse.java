// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrawlerTypeCapabilitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCrawlerTypeCapabilitiesResponseBody body;

    public static GetCrawlerTypeCapabilitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrawlerTypeCapabilitiesResponse self = new GetCrawlerTypeCapabilitiesResponse();
        return TeaModel.build(map, self);
    }

    public GetCrawlerTypeCapabilitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrawlerTypeCapabilitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrawlerTypeCapabilitiesResponse setBody(GetCrawlerTypeCapabilitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrawlerTypeCapabilitiesResponseBody getBody() {
        return this.body;
    }

}
