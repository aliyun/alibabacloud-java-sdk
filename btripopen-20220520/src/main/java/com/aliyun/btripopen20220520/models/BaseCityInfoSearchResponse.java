// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BaseCityInfoSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BaseCityInfoSearchResponseBody body;

    public static BaseCityInfoSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseCityInfoSearchResponse self = new BaseCityInfoSearchResponse();
        return TeaModel.build(map, self);
    }

    public BaseCityInfoSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BaseCityInfoSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BaseCityInfoSearchResponse setBody(BaseCityInfoSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public BaseCityInfoSearchResponseBody getBody() {
        return this.body;
    }

}
