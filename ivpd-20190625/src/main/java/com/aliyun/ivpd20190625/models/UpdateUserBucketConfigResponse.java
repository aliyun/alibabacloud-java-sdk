// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class UpdateUserBucketConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserBucketConfigResponseBody body;

    public static UpdateUserBucketConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserBucketConfigResponse self = new UpdateUserBucketConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserBucketConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserBucketConfigResponse setBody(UpdateUserBucketConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserBucketConfigResponseBody getBody() {
        return this.body;
    }

}
