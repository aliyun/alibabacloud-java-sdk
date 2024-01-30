// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListPublishedServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishedServicesResponseBody body;

    public static ListPublishedServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedServicesResponse self = new ListPublishedServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishedServicesResponse setBody(ListPublishedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedServicesResponseBody getBody() {
        return this.body;
    }

}
