// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListPluginStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPluginStatusResponseBody body;

    public static ListPluginStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPluginStatusResponse self = new ListPluginStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListPluginStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPluginStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPluginStatusResponse setBody(ListPluginStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPluginStatusResponseBody getBody() {
        return this.body;
    }

}
