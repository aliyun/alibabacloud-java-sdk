// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomEntitiesResponseBody body;

    public static ListCustomEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomEntitiesResponse self = new ListCustomEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomEntitiesResponse setBody(ListCustomEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomEntitiesResponseBody getBody() {
        return this.body;
    }

}
