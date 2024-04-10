// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappSyncPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChatappSyncPhoneNumberResponseBody body;

    public static ChatappSyncPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatappSyncPhoneNumberResponse self = new ChatappSyncPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public ChatappSyncPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChatappSyncPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChatappSyncPhoneNumberResponse setBody(ChatappSyncPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ChatappSyncPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
