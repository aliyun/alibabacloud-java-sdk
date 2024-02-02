// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIvrTrackingDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIvrTrackingDetailsResponseBody body;

    public static ListIvrTrackingDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIvrTrackingDetailsResponse self = new ListIvrTrackingDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListIvrTrackingDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIvrTrackingDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIvrTrackingDetailsResponse setBody(ListIvrTrackingDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIvrTrackingDetailsResponseBody getBody() {
        return this.body;
    }

}
