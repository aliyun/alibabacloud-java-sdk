// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddDocAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDocAsyncResponseBody body;

    public static AddDocAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDocAsyncResponse self = new AddDocAsyncResponse();
        return TeaModel.build(map, self);
    }

    public AddDocAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDocAsyncResponse setBody(AddDocAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDocAsyncResponseBody getBody() {
        return this.body;
    }

}
