// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KopilotListConversationsResponseBody body;

    public static KopilotListConversationsResponse build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationsResponse self = new KopilotListConversationsResponse();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KopilotListConversationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KopilotListConversationsResponse setBody(KopilotListConversationsResponseBody body) {
        this.body = body;
        return this;
    }
    public KopilotListConversationsResponseBody getBody() {
        return this.body;
    }

}
