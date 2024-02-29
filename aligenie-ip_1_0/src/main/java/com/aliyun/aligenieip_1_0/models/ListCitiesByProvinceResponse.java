// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListCitiesByProvinceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCitiesByProvinceResponseBody body;

    public static ListCitiesByProvinceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCitiesByProvinceResponse self = new ListCitiesByProvinceResponse();
        return TeaModel.build(map, self);
    }

    public ListCitiesByProvinceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCitiesByProvinceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCitiesByProvinceResponse setBody(ListCitiesByProvinceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCitiesByProvinceResponseBody getBody() {
        return this.body;
    }

}
