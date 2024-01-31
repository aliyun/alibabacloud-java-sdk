// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CitySearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CitySearchResponseBody body;

    public static CitySearchResponse build(java.util.Map<String, ?> map) throws Exception {
        CitySearchResponse self = new CitySearchResponse();
        return TeaModel.build(map, self);
    }

    public CitySearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CitySearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CitySearchResponse setBody(CitySearchResponseBody body) {
        this.body = body;
        return this;
    }
    public CitySearchResponseBody getBody() {
        return this.body;
    }

}
