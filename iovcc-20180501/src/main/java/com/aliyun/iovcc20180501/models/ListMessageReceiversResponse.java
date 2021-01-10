// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMessageReceiversResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMessageReceiversResponseBody body;

    public static ListMessageReceiversResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageReceiversResponse self = new ListMessageReceiversResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageReceiversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageReceiversResponse setBody(ListMessageReceiversResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageReceiversResponseBody getBody() {
        return this.body;
    }

}
