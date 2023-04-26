// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListErRouteEntriesResponseBody body;

    public static ListErRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListErRouteEntriesResponse self = new ListErRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListErRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListErRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListErRouteEntriesResponse setBody(ListErRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListErRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
