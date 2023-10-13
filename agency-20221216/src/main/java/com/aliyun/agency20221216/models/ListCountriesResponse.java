// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCountriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCountriesResponseBody body;

    public static ListCountriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCountriesResponse self = new ListCountriesResponse();
        return TeaModel.build(map, self);
    }

    public ListCountriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCountriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCountriesResponse setBody(ListCountriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCountriesResponseBody getBody() {
        return this.body;
    }

}
