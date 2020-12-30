// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListFCTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFCTriggerResponseBody body;

    public static ListFCTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFCTriggerResponse self = new ListFCTriggerResponse();
        return TeaModel.build(map, self);
    }

    public ListFCTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFCTriggerResponse setBody(ListFCTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFCTriggerResponseBody getBody() {
        return this.body;
    }

}
