// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateRemediationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRemediationResponseBody body;

    public static UpdateRemediationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRemediationResponse self = new UpdateRemediationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRemediationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRemediationResponse setBody(UpdateRemediationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRemediationResponseBody getBody() {
        return this.body;
    }

}
