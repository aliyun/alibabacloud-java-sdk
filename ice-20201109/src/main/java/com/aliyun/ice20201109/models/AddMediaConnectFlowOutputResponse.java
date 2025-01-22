// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaConnectFlowOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMediaConnectFlowOutputResponseBody body;

    public static AddMediaConnectFlowOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaConnectFlowOutputResponse self = new AddMediaConnectFlowOutputResponse();
        return TeaModel.build(map, self);
    }

    public AddMediaConnectFlowOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMediaConnectFlowOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMediaConnectFlowOutputResponse setBody(AddMediaConnectFlowOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaConnectFlowOutputResponseBody getBody() {
        return this.body;
    }

}
