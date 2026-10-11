// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEgressProxyConfigurationResponseBody body;

    public static DeleteEgressProxyConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyConfigurationResponse self = new DeleteEgressProxyConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEgressProxyConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEgressProxyConfigurationResponse setBody(DeleteEgressProxyConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEgressProxyConfigurationResponseBody getBody() {
        return this.body;
    }

}
