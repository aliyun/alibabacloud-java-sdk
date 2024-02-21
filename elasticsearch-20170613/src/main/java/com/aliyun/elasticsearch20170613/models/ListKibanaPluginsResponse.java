// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKibanaPluginsResponseBody body;

    public static ListKibanaPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKibanaPluginsResponse self = new ListKibanaPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListKibanaPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKibanaPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKibanaPluginsResponse setBody(ListKibanaPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKibanaPluginsResponseBody getBody() {
        return this.body;
    }

}
