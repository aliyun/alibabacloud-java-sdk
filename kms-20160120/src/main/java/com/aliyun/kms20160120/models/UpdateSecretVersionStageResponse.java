// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSecretVersionStageResponseBody body;

    public static UpdateSecretVersionStageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretVersionStageResponse self = new UpdateSecretVersionStageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecretVersionStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecretVersionStageResponse setBody(UpdateSecretVersionStageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecretVersionStageResponseBody getBody() {
        return this.body;
    }

}
