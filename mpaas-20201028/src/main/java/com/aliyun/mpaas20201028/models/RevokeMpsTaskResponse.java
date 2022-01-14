// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RevokeMpsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeMpsTaskResponseBody body;

    public static RevokeMpsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeMpsTaskResponse self = new RevokeMpsTaskResponse();
        return TeaModel.build(map, self);
    }

    public RevokeMpsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeMpsTaskResponse setBody(RevokeMpsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeMpsTaskResponseBody getBody() {
        return this.body;
    }

}
