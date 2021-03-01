// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationResponseBody body;

    public static ListApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationResponse self = new ListApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationResponse setBody(ListApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationResponseBody getBody() {
        return this.body;
    }

}
