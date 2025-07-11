// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatFlowResponseBody body;

    public static ListChatFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatFlowResponse self = new ListChatFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListChatFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatFlowResponse setBody(ListChatFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatFlowResponseBody getBody() {
        return this.body;
    }

}
