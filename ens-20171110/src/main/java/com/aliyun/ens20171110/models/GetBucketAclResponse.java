// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBucketAclResponseBody body;

    public static GetBucketAclResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketAclResponse self = new GetBucketAclResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketAclResponse setBody(GetBucketAclResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketAclResponseBody getBody() {
        return this.body;
    }

}
