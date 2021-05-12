// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentAndGenerateVendorConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnvironmentAndGenerateVendorConfigResponseBody body;

    public static CreateEnvironmentAndGenerateVendorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentAndGenerateVendorConfigResponse self = new CreateEnvironmentAndGenerateVendorConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentAndGenerateVendorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvironmentAndGenerateVendorConfigResponse setBody(CreateEnvironmentAndGenerateVendorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvironmentAndGenerateVendorConfigResponseBody getBody() {
        return this.body;
    }

}
