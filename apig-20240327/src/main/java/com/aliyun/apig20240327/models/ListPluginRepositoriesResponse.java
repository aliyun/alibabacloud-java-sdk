// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginRepositoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPluginRepositoriesResponseBody body;

    public static ListPluginRepositoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPluginRepositoriesResponse self = new ListPluginRepositoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListPluginRepositoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPluginRepositoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPluginRepositoriesResponse setBody(ListPluginRepositoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPluginRepositoriesResponseBody getBody() {
        return this.body;
    }

}
