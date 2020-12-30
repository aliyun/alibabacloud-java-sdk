// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class InactivatePhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InactivatePhotosResponseBody body;

    public static InactivatePhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        InactivatePhotosResponse self = new InactivatePhotosResponse();
        return TeaModel.build(map, self);
    }

    public InactivatePhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InactivatePhotosResponse setBody(InactivatePhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public InactivatePhotosResponseBody getBody() {
        return this.body;
    }

}
