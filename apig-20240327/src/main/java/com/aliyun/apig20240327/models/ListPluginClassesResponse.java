// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginClassesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPluginClassesResponseBody body;

    public static ListPluginClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPluginClassesResponse self = new ListPluginClassesResponse();
        return TeaModel.build(map, self);
    }

    public ListPluginClassesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPluginClassesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPluginClassesResponse setBody(ListPluginClassesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPluginClassesResponseBody getBody() {
        return this.body;
    }

}
