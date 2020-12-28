// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UninstallSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallSoftwareResponseBody body;

    public static UninstallSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallSoftwareResponse self = new UninstallSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public UninstallSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallSoftwareResponse setBody(UninstallSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallSoftwareResponseBody getBody() {
        return this.body;
    }

}
