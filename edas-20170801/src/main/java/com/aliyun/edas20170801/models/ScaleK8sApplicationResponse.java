// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleK8sApplicationResponseBody body;

    public static ScaleK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleK8sApplicationResponse self = new ScaleK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ScaleK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleK8sApplicationResponse setBody(ScaleK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
