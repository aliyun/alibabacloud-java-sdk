// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListStackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStackResponseBody body;

    public static ListStackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackResponse self = new ListStackResponse();
        return TeaModel.build(map, self);
    }

    public ListStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackResponse setBody(ListStackResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackResponseBody getBody() {
        return this.body;
    }

}
