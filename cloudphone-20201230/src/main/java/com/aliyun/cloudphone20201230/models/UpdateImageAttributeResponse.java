// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class UpdateImageAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateImageAttributeResponseBody body;

    public static UpdateImageAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageAttributeResponse self = new UpdateImageAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageAttributeResponse setBody(UpdateImageAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageAttributeResponseBody getBody() {
        return this.body;
    }

}
