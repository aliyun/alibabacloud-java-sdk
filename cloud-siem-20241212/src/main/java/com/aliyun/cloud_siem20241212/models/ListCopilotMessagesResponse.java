// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListCopilotMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCopilotMessagesResponseBody body;

    public static ListCopilotMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCopilotMessagesResponse self = new ListCopilotMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListCopilotMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCopilotMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCopilotMessagesResponse setBody(ListCopilotMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCopilotMessagesResponseBody getBody() {
        return this.body;
    }

}
