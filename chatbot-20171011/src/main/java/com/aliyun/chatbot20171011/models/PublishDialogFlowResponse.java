// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PublishDialogFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishDialogFlowResponseBody body;

    public static PublishDialogFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishDialogFlowResponse self = new PublishDialogFlowResponse();
        return TeaModel.build(map, self);
    }

    public PublishDialogFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishDialogFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishDialogFlowResponse setBody(PublishDialogFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishDialogFlowResponseBody getBody() {
        return this.body;
    }

}
