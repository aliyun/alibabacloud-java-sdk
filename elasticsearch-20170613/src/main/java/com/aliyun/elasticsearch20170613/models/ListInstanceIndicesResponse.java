// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceIndicesResponseBody body;

    public static ListInstanceIndicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceIndicesResponse self = new ListInstanceIndicesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceIndicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceIndicesResponse setBody(ListInstanceIndicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceIndicesResponseBody getBody() {
        return this.body;
    }

}
