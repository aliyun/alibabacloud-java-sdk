// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class JoinFabricChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinFabricChannelResponseBody body;

    public static JoinFabricChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinFabricChannelResponse self = new JoinFabricChannelResponse();
        return TeaModel.build(map, self);
    }

    public JoinFabricChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinFabricChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinFabricChannelResponse setBody(JoinFabricChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinFabricChannelResponseBody getBody() {
        return this.body;
    }

}
