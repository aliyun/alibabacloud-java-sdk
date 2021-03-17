// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ErasePersonResponseBody body;

    public static ErasePersonResponse build(java.util.Map<String, ?> map) throws Exception {
        ErasePersonResponse self = new ErasePersonResponse();
        return TeaModel.build(map, self);
    }

    public ErasePersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ErasePersonResponse setBody(ErasePersonResponseBody body) {
        this.body = body;
        return this;
    }
    public ErasePersonResponseBody getBody() {
        return this.body;
    }

}
