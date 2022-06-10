// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListReservedCapacitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListReservedCapacitiesResponseBody body;

    public static ListReservedCapacitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReservedCapacitiesResponse self = new ListReservedCapacitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListReservedCapacitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReservedCapacitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReservedCapacitiesResponse setBody(ListReservedCapacitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReservedCapacitiesResponseBody getBody() {
        return this.body;
    }

}
