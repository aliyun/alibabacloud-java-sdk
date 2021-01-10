// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeployModelBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployModelBatchResponseBody body;

    public static DeployModelBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployModelBatchResponse self = new DeployModelBatchResponse();
        return TeaModel.build(map, self);
    }

    public DeployModelBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployModelBatchResponse setBody(DeployModelBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployModelBatchResponseBody getBody() {
        return this.body;
    }

}
