// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddImageAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddImageAsyncResponseBody body;

    public static AddImageAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageAsyncResponse self = new AddImageAsyncResponse();
        return TeaModel.build(map, self);
    }

    public AddImageAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageAsyncResponse setBody(AddImageAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageAsyncResponseBody getBody() {
        return this.body;
    }

}
