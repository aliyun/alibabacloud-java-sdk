// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListApmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApmResponseBody body;

    public static ListApmResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApmResponse self = new ListApmResponse();
        return TeaModel.build(map, self);
    }

    public ListApmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApmResponse setBody(ListApmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApmResponseBody getBody() {
        return this.body;
    }

}
