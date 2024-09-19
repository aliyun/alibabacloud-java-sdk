// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodeDependenciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeDependenciesResponseBody body;

    public static ListNodeDependenciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDependenciesResponse self = new ListNodeDependenciesResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeDependenciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeDependenciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeDependenciesResponse setBody(ListNodeDependenciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeDependenciesResponseBody getBody() {
        return this.body;
    }

}
