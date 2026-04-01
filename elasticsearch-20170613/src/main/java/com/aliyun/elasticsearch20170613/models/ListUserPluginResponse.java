// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListUserPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserPluginResponseBody body;

    public static ListUserPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPluginResponse self = new ListUserPluginResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserPluginResponse setBody(ListUserPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPluginResponseBody getBody() {
        return this.body;
    }

}
