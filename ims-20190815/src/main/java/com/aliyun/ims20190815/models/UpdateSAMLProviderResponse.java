// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateSAMLProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSAMLProviderResponseBody body;

    public static UpdateSAMLProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSAMLProviderResponse self = new UpdateSAMLProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSAMLProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSAMLProviderResponse setBody(UpdateSAMLProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSAMLProviderResponseBody getBody() {
        return this.body;
    }

}
