// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UntagResourcesNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UntagResourcesNewResponseBody body;

    public static UntagResourcesNewResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesNewResponse self = new UntagResourcesNewResponse();
        return TeaModel.build(map, self);
    }

    public UntagResourcesNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagResourcesNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UntagResourcesNewResponse setBody(UntagResourcesNewResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagResourcesNewResponseBody getBody() {
        return this.body;
    }

}
