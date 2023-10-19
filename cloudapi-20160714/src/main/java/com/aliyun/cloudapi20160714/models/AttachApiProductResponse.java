// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachApiProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachApiProductResponseBody body;

    public static AttachApiProductResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachApiProductResponse self = new AttachApiProductResponse();
        return TeaModel.build(map, self);
    }

    public AttachApiProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachApiProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachApiProductResponse setBody(AttachApiProductResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachApiProductResponseBody getBody() {
        return this.body;
    }

}
