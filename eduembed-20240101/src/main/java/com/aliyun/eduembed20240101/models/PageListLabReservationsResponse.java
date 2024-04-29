// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabReservationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageListLabReservationsResponseBody body;

    public static PageListLabReservationsResponse build(java.util.Map<String, ?> map) throws Exception {
        PageListLabReservationsResponse self = new PageListLabReservationsResponse();
        return TeaModel.build(map, self);
    }

    public PageListLabReservationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageListLabReservationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageListLabReservationsResponse setBody(PageListLabReservationsResponseBody body) {
        this.body = body;
        return this;
    }
    public PageListLabReservationsResponseBody getBody() {
        return this.body;
    }

}
