// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ReadChatFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadChatFlowResponseBody body;

    public static ReadChatFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadChatFlowResponse self = new ReadChatFlowResponse();
        return TeaModel.build(map, self);
    }

    public ReadChatFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadChatFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadChatFlowResponse setBody(ReadChatFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadChatFlowResponseBody getBody() {
        return this.body;
    }

}
