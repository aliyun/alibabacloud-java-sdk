// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckChatappContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckChatappContactsResponseBody body;

    public static CheckChatappContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckChatappContactsResponse self = new CheckChatappContactsResponse();
        return TeaModel.build(map, self);
    }

    public CheckChatappContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckChatappContactsResponse setBody(CheckChatappContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckChatappContactsResponseBody getBody() {
        return this.body;
    }

}
