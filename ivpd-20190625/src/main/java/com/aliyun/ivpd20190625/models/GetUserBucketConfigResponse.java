// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetUserBucketConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserBucketConfigResponseBody body;

    public static GetUserBucketConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserBucketConfigResponse self = new GetUserBucketConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetUserBucketConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserBucketConfigResponse setBody(GetUserBucketConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserBucketConfigResponseBody getBody() {
        return this.body;
    }

}
