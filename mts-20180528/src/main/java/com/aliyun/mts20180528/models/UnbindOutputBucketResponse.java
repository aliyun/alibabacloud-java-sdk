// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UnbindOutputBucketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindOutputBucketResponseBody body;

    public static UnbindOutputBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindOutputBucketResponse self = new UnbindOutputBucketResponse();
        return TeaModel.build(map, self);
    }

    public UnbindOutputBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindOutputBucketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindOutputBucketResponse setBody(UnbindOutputBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindOutputBucketResponseBody getBody() {
        return this.body;
    }

}
