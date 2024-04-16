// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleDependenciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModuleDependenciesResponseBody body;

    public static ListModuleDependenciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModuleDependenciesResponse self = new ListModuleDependenciesResponse();
        return TeaModel.build(map, self);
    }

    public ListModuleDependenciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModuleDependenciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModuleDependenciesResponse setBody(ListModuleDependenciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModuleDependenciesResponseBody getBody() {
        return this.body;
    }

}
