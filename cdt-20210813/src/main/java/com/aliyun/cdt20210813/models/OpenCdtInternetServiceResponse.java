// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class OpenCdtInternetServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenCdtInternetServiceResponseBody body;

    public static OpenCdtInternetServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCdtInternetServiceResponse self = new OpenCdtInternetServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenCdtInternetServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCdtInternetServiceResponse setBody(OpenCdtInternetServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCdtInternetServiceResponseBody getBody() {
        return this.body;
    }

}
