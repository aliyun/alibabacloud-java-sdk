// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class OpenNASServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenNASServiceResponseBody body;

    public static OpenNASServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenNASServiceResponse self = new OpenNASServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenNASServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenNASServiceResponse setBody(OpenNASServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenNASServiceResponseBody getBody() {
        return this.body;
    }

}
