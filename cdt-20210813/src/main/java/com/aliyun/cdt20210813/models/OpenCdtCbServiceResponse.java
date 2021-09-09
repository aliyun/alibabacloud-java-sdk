// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class OpenCdtCbServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenCdtCbServiceResponseBody body;

    public static OpenCdtCbServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCdtCbServiceResponse self = new OpenCdtCbServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenCdtCbServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCdtCbServiceResponse setBody(OpenCdtCbServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCdtCbServiceResponseBody getBody() {
        return this.body;
    }

}
