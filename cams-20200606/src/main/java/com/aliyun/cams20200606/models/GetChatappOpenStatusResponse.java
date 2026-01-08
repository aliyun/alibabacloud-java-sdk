// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatappOpenStatusResponseBody body;

    public static GetChatappOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatappOpenStatusResponse self = new GetChatappOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetChatappOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatappOpenStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatappOpenStatusResponse setBody(GetChatappOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatappOpenStatusResponseBody getBody() {
        return this.body;
    }

}
