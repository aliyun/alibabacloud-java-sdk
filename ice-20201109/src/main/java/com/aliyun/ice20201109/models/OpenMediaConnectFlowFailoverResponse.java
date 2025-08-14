// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class OpenMediaConnectFlowFailoverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenMediaConnectFlowFailoverResponseBody body;

    public static OpenMediaConnectFlowFailoverResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenMediaConnectFlowFailoverResponse self = new OpenMediaConnectFlowFailoverResponse();
        return TeaModel.build(map, self);
    }

    public OpenMediaConnectFlowFailoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenMediaConnectFlowFailoverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenMediaConnectFlowFailoverResponse setBody(OpenMediaConnectFlowFailoverResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenMediaConnectFlowFailoverResponseBody getBody() {
        return this.body;
    }

}
