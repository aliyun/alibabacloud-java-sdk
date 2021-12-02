// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListKeyPairsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListKeyPairsResponseBody body;

    public static ListKeyPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeyPairsResponse self = new ListKeyPairsResponse();
        return TeaModel.build(map, self);
    }

    public ListKeyPairsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKeyPairsResponse setBody(ListKeyPairsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKeyPairsResponseBody getBody() {
        return this.body;
    }

}
