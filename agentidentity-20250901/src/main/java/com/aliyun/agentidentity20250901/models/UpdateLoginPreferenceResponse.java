// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateLoginPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLoginPreferenceResponseBody body;

    public static UpdateLoginPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginPreferenceResponse self = new UpdateLoginPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoginPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLoginPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLoginPreferenceResponse setBody(UpdateLoginPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoginPreferenceResponseBody getBody() {
        return this.body;
    }

}
