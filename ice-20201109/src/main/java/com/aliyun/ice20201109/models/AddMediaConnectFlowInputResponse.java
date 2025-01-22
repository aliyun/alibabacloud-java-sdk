// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaConnectFlowInputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMediaConnectFlowInputResponseBody body;

    public static AddMediaConnectFlowInputResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaConnectFlowInputResponse self = new AddMediaConnectFlowInputResponse();
        return TeaModel.build(map, self);
    }

    public AddMediaConnectFlowInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMediaConnectFlowInputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMediaConnectFlowInputResponse setBody(AddMediaConnectFlowInputResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaConnectFlowInputResponseBody getBody() {
        return this.body;
    }

}
