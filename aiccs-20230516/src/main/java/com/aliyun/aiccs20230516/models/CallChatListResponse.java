// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class CallChatListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CallChatListResponseBody body;

    public static CallChatListResponse build(java.util.Map<String, ?> map) throws Exception {
        CallChatListResponse self = new CallChatListResponse();
        return TeaModel.build(map, self);
    }

    public CallChatListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallChatListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CallChatListResponse setBody(CallChatListResponseBody body) {
        this.body = body;
        return this;
    }
    public CallChatListResponseBody getBody() {
        return this.body;
    }

}
