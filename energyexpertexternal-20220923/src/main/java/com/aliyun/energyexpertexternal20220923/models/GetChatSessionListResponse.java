// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetChatSessionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatSessionListResponseBody body;

    public static GetChatSessionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatSessionListResponse self = new GetChatSessionListResponse();
        return TeaModel.build(map, self);
    }

    public GetChatSessionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatSessionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatSessionListResponse setBody(GetChatSessionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatSessionListResponseBody getBody() {
        return this.body;
    }

}
