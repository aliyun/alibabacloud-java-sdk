// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListOfflineMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOfflineMessagesResponseBody body;

    public static ListOfflineMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineMessagesResponse self = new ListOfflineMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListOfflineMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOfflineMessagesResponse setBody(ListOfflineMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOfflineMessagesResponseBody getBody() {
        return this.body;
    }

}
