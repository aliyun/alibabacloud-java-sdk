// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListAutoDisposeEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoDisposeEntitiesResponseBody body;

    public static ListAutoDisposeEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoDisposeEntitiesResponse self = new ListAutoDisposeEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoDisposeEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoDisposeEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoDisposeEntitiesResponse setBody(ListAutoDisposeEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoDisposeEntitiesResponseBody getBody() {
        return this.body;
    }

}
