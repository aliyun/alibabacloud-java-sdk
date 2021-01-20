// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class OpenCmsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenCmsServiceResponseBody body;

    public static OpenCmsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCmsServiceResponse self = new OpenCmsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenCmsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCmsServiceResponse setBody(OpenCmsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCmsServiceResponseBody getBody() {
        return this.body;
    }

}
