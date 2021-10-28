// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ListRemindersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRemindersResponseBody body;

    public static ListRemindersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRemindersResponse self = new ListRemindersResponse();
        return TeaModel.build(map, self);
    }

    public ListRemindersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRemindersResponse setBody(ListRemindersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRemindersResponseBody getBody() {
        return this.body;
    }

}
