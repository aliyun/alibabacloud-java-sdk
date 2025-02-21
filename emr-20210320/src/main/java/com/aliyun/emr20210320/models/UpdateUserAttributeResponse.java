// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateUserAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserAttributeResponseBody body;

    public static UpdateUserAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAttributeResponse self = new UpdateUserAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserAttributeResponse setBody(UpdateUserAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserAttributeResponseBody getBody() {
        return this.body;
    }

}
