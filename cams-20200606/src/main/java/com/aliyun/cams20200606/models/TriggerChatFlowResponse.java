// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class TriggerChatFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerChatFlowResponseBody body;

    public static TriggerChatFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerChatFlowResponse self = new TriggerChatFlowResponse();
        return TeaModel.build(map, self);
    }

    public TriggerChatFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerChatFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerChatFlowResponse setBody(TriggerChatFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerChatFlowResponseBody getBody() {
        return this.body;
    }

}
