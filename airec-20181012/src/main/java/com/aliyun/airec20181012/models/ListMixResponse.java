// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListMixResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMixResponseBody body;

    public static ListMixResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMixResponse self = new ListMixResponse();
        return TeaModel.build(map, self);
    }

    public ListMixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMixResponse setBody(ListMixResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMixResponseBody getBody() {
        return this.body;
    }

}
