// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class TestDialogFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestDialogFlowResponseBody body;

    public static TestDialogFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        TestDialogFlowResponse self = new TestDialogFlowResponse();
        return TeaModel.build(map, self);
    }

    public TestDialogFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestDialogFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestDialogFlowResponse setBody(TestDialogFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public TestDialogFlowResponseBody getBody() {
        return this.body;
    }

}
