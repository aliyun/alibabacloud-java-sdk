// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPluginsResponseBody body;

    public static ListPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsResponse self = new ListPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPluginsResponse setBody(ListPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPluginsResponseBody getBody() {
        return this.body;
    }

}
