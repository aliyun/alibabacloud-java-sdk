// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployDISyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployDISyncTaskResponseBody body;

    public static DeployDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployDISyncTaskResponse self = new DeployDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeployDISyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployDISyncTaskResponse setBody(DeployDISyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployDISyncTaskResponseBody getBody() {
        return this.body;
    }

}
