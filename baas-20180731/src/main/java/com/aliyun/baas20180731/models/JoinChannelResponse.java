// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class JoinChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinChannelResponseBody body;

    public static JoinChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinChannelResponse self = new JoinChannelResponse();
        return TeaModel.build(map, self);
    }

    public JoinChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinChannelResponse setBody(JoinChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinChannelResponseBody getBody() {
        return this.body;
    }

}
