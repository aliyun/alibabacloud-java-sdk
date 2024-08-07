// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetChatMediaUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatMediaUrlResponseBody body;

    public static GetChatMediaUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatMediaUrlResponse self = new GetChatMediaUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetChatMediaUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatMediaUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatMediaUrlResponse setBody(GetChatMediaUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatMediaUrlResponseBody getBody() {
        return this.body;
    }

}
