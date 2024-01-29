// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEntitiesResponseBody body;

    public static ListEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesResponse self = new ListEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEntitiesResponse setBody(ListEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEntitiesResponseBody getBody() {
        return this.body;
    }

}
