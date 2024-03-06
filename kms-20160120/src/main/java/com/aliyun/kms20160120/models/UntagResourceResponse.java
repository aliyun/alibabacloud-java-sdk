// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UntagResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UntagResourceResponseBody body;

    public static UntagResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceResponse self = new UntagResourceResponse();
        return TeaModel.build(map, self);
    }

    public UntagResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UntagResourceResponse setBody(UntagResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagResourceResponseBody getBody() {
        return this.body;
    }

}
