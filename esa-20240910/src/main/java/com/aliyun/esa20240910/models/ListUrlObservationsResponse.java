// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUrlObservationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUrlObservationsResponseBody body;

    public static ListUrlObservationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUrlObservationsResponse self = new ListUrlObservationsResponse();
        return TeaModel.build(map, self);
    }

    public ListUrlObservationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUrlObservationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUrlObservationsResponse setBody(ListUrlObservationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUrlObservationsResponseBody getBody() {
        return this.body;
    }

}
