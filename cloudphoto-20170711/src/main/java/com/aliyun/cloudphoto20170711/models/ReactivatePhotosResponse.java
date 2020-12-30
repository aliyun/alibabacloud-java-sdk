// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ReactivatePhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReactivatePhotosResponseBody body;

    public static ReactivatePhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        ReactivatePhotosResponse self = new ReactivatePhotosResponse();
        return TeaModel.build(map, self);
    }

    public ReactivatePhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReactivatePhotosResponse setBody(ReactivatePhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public ReactivatePhotosResponseBody getBody() {
        return this.body;
    }

}
