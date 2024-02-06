// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketLifecycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBucketLifecycleResponseBody body;

    public static GetBucketLifecycleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLifecycleResponse self = new GetBucketLifecycleResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketLifecycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketLifecycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketLifecycleResponse setBody(GetBucketLifecycleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketLifecycleResponseBody getBody() {
        return this.body;
    }

}
