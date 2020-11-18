// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20200310.models;

import com.aliyun.tea.*;

public class OpenFcServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenFcServiceResponseBody body;

    public static OpenFcServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenFcServiceResponse self = new OpenFcServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenFcServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenFcServiceResponse setBody(OpenFcServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenFcServiceResponseBody getBody() {
        return this.body;
    }

}
