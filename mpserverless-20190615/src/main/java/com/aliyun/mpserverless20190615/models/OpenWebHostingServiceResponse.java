// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenWebHostingServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenWebHostingServiceResponseBody body;

    public static OpenWebHostingServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenWebHostingServiceResponse self = new OpenWebHostingServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenWebHostingServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenWebHostingServiceResponse setBody(OpenWebHostingServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenWebHostingServiceResponseBody getBody() {
        return this.body;
    }

}
