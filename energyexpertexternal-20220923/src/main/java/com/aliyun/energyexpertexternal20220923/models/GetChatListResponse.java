// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetChatListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatListResponseBody body;

    public static GetChatListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatListResponse self = new GetChatListResponse();
        return TeaModel.build(map, self);
    }

    public GetChatListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatListResponse setBody(GetChatListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatListResponseBody getBody() {
        return this.body;
    }

}
