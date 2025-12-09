// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetChatContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatContentResponseBody body;

    public static GetChatContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatContentResponse self = new GetChatContentResponse();
        return TeaModel.build(map, self);
    }

    public GetChatContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatContentResponse setBody(GetChatContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatContentResponseBody getBody() {
        return this.body;
    }

}
