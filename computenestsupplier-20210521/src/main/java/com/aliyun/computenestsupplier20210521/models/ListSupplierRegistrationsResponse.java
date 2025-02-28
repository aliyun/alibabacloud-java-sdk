// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListSupplierRegistrationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupplierRegistrationsResponseBody body;

    public static ListSupplierRegistrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupplierRegistrationsResponse self = new ListSupplierRegistrationsResponse();
        return TeaModel.build(map, self);
    }

    public ListSupplierRegistrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupplierRegistrationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupplierRegistrationsResponse setBody(ListSupplierRegistrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupplierRegistrationsResponseBody getBody() {
        return this.body;
    }

}
