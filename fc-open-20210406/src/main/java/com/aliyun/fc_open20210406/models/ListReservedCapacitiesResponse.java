// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListReservedCapacitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListReservedCapacitiesResponse setBody(ListReservedCapacitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReservedCapacitiesResponseBody getBody() {
        return this.body;
    }

}
