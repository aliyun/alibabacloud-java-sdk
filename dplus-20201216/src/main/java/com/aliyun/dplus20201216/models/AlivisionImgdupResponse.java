// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class AlivisionImgdupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.Map<String, ?> body;

    public static AlivisionImgdupResponse build(java.util.Map<String, ?> map) throws Exception {
        AlivisionImgdupResponse self = new AlivisionImgdupResponse();
        return TeaModel.build(map, self);
    }

    public AlivisionImgdupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlivisionImgdupResponse setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
