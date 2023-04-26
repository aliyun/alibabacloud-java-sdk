// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVccRouteEntriesResponseBody body;

    public static ListVccRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVccRouteEntriesResponse self = new ListVccRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListVccRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVccRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVccRouteEntriesResponse setBody(ListVccRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVccRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
