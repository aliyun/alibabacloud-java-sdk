// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceRegistrationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceRegistrationsResponseBody body;

    public static ListServiceRegistrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRegistrationsResponse self = new ListServiceRegistrationsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceRegistrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceRegistrationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceRegistrationsResponse setBody(ListServiceRegistrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceRegistrationsResponseBody getBody() {
        return this.body;
    }

}
