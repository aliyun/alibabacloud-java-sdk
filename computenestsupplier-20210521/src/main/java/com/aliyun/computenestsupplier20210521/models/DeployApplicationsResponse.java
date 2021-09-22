// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeployApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployApplicationsResponseBody body;

    public static DeployApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationsResponse self = new DeployApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public DeployApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployApplicationsResponse setBody(DeployApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployApplicationsResponseBody getBody() {
        return this.body;
    }

}
