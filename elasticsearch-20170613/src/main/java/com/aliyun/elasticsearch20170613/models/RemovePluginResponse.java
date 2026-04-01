// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RemovePluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePluginResponseBody body;

    public static RemovePluginResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePluginResponse self = new RemovePluginResponse();
        return TeaModel.build(map, self);
    }

    public RemovePluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePluginResponse setBody(RemovePluginResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePluginResponseBody getBody() {
        return this.body;
    }

}
