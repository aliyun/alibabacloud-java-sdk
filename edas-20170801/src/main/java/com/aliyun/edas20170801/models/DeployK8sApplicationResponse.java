// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeployK8sApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployK8sApplicationResponseBody body;

    public static DeployK8sApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployK8sApplicationResponse self = new DeployK8sApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeployK8sApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployK8sApplicationResponse setBody(DeployK8sApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployK8sApplicationResponseBody getBody() {
        return this.body;
    }

}
