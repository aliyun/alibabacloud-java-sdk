// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UpdatePropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePropertyResponseBody body;

    public static UpdatePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePropertyResponse self = new UpdatePropertyResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePropertyResponse setBody(UpdatePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePropertyResponseBody getBody() {
        return this.body;
    }

}
