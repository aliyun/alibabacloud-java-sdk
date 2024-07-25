// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeletePluginConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePluginConfigResponseBody body;

    public static DeletePluginConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginConfigResponse self = new DeletePluginConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeletePluginConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePluginConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePluginConfigResponse setBody(DeletePluginConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePluginConfigResponseBody getBody() {
        return this.body;
    }

}
