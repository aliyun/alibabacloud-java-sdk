// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RenameFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenameFaceResponseBody body;

    public static RenameFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameFaceResponse self = new RenameFaceResponse();
        return TeaModel.build(map, self);
    }

    public RenameFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameFaceResponse setBody(RenameFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameFaceResponseBody getBody() {
        return this.body;
    }

}
