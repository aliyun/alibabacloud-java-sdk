// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListPreChecksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPreChecksResponseBody body;

    public static ListPreChecksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPreChecksResponse self = new ListPreChecksResponse();
        return TeaModel.build(map, self);
    }

    public ListPreChecksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPreChecksResponse setBody(ListPreChecksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPreChecksResponseBody getBody() {
        return this.body;
    }

}
