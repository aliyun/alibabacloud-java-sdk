// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ContinueDeployServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ContinueDeployServiceInstanceResponseBody body;

    public static ContinueDeployServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeployServiceInstanceResponse self = new ContinueDeployServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ContinueDeployServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinueDeployServiceInstanceResponse setBody(ContinueDeployServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinueDeployServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
