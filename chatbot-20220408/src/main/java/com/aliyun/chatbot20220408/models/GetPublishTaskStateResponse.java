// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetPublishTaskStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublishTaskStateResponseBody body;

    public static GetPublishTaskStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishTaskStateResponse self = new GetPublishTaskStateResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishTaskStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublishTaskStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublishTaskStateResponse setBody(GetPublishTaskStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublishTaskStateResponseBody getBody() {
        return this.body;
    }

}
