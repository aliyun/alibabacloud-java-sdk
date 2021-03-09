// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartChatWorkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartChatWorkResponseBody body;

    public static StartChatWorkResponse build(java.util.Map<String, ?> map) throws Exception {
        StartChatWorkResponse self = new StartChatWorkResponse();
        return TeaModel.build(map, self);
    }

    public StartChatWorkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartChatWorkResponse setBody(StartChatWorkResponseBody body) {
        this.body = body;
        return this;
    }
    public StartChatWorkResponseBody getBody() {
        return this.body;
    }

}
