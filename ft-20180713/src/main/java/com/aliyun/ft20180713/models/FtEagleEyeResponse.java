// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtEagleEyeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FtEagleEyeResponseBody body;

    public static FtEagleEyeResponse build(java.util.Map<String, ?> map) throws Exception {
        FtEagleEyeResponse self = new FtEagleEyeResponse();
        return TeaModel.build(map, self);
    }

    public FtEagleEyeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FtEagleEyeResponse setBody(FtEagleEyeResponseBody body) {
        this.body = body;
        return this;
    }
    public FtEagleEyeResponseBody getBody() {
        return this.body;
    }

}
