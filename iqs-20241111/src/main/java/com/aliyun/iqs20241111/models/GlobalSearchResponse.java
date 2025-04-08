// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalSearchResult body;

    public static GlobalSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalSearchResponse self = new GlobalSearchResponse();
        return TeaModel.build(map, self);
    }

    public GlobalSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalSearchResponse setBody(GlobalSearchResult body) {
        this.body = body;
        return this;
    }
    public GlobalSearchResult getBody() {
        return this.body;
    }

}
