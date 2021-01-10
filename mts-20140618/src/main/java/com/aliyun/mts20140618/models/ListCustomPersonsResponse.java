// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomPersonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCustomPersonsResponseBody body;

    public static ListCustomPersonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPersonsResponse self = new ListCustomPersonsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomPersonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomPersonsResponse setBody(ListCustomPersonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomPersonsResponseBody getBody() {
        return this.body;
    }

}
