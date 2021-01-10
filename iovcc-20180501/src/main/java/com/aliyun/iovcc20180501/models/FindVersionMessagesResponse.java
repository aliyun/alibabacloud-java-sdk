// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindVersionMessagesResponseBody body;

    public static FindVersionMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindVersionMessagesResponse self = new FindVersionMessagesResponse();
        return TeaModel.build(map, self);
    }

    public FindVersionMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindVersionMessagesResponse setBody(FindVersionMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindVersionMessagesResponseBody getBody() {
        return this.body;
    }

}
