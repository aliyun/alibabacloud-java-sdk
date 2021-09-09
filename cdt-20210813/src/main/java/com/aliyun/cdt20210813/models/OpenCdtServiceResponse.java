// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class OpenCdtServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenCdtServiceResponseBody body;

    public static OpenCdtServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCdtServiceResponse self = new OpenCdtServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenCdtServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCdtServiceResponse setBody(OpenCdtServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCdtServiceResponseBody getBody() {
        return this.body;
    }

}
