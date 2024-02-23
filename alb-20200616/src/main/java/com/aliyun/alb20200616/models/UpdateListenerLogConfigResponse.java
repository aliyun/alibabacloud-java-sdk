// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateListenerLogConfigResponseBody body;

    public static UpdateListenerLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerLogConfigResponse self = new UpdateListenerLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateListenerLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateListenerLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateListenerLogConfigResponse setBody(UpdateListenerLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateListenerLogConfigResponseBody getBody() {
        return this.body;
    }

}
