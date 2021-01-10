// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSmsSignsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSmsSignsResponseBody body;

    public static ListSmsSignsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmsSignsResponse self = new ListSmsSignsResponse();
        return TeaModel.build(map, self);
    }

    public ListSmsSignsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmsSignsResponse setBody(ListSmsSignsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmsSignsResponseBody getBody() {
        return this.body;
    }

}
