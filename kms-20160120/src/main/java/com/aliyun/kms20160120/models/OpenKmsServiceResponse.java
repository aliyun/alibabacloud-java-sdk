// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class OpenKmsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenKmsServiceResponseBody body;

    public static OpenKmsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenKmsServiceResponse self = new OpenKmsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenKmsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenKmsServiceResponse setBody(OpenKmsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenKmsServiceResponseBody getBody() {
        return this.body;
    }

}
