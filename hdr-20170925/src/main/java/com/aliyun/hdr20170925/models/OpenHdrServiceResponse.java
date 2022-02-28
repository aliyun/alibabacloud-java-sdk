// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class OpenHdrServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenHdrServiceResponseBody body;

    public static OpenHdrServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenHdrServiceResponse self = new OpenHdrServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenHdrServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenHdrServiceResponse setBody(OpenHdrServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenHdrServiceResponseBody getBody() {
        return this.body;
    }

}
