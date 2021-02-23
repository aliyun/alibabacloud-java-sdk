// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddVideoAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddVideoAsyncResponseBody body;

    public static AddVideoAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVideoAsyncResponse self = new AddVideoAsyncResponse();
        return TeaModel.build(map, self);
    }

    public AddVideoAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVideoAsyncResponse setBody(AddVideoAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVideoAsyncResponseBody getBody() {
        return this.body;
    }

}
