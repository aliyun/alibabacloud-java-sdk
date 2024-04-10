// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappBindWabaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatappBindWabaResponseBody body;

    public static ChatappBindWabaResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatappBindWabaResponse self = new ChatappBindWabaResponse();
        return TeaModel.build(map, self);
    }

    public ChatappBindWabaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatappBindWabaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatappBindWabaResponse setBody(ChatappBindWabaResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatappBindWabaResponseBody getBody() {
        return this.body;
    }

}
