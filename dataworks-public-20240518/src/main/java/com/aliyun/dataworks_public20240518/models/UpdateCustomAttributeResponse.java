// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCustomAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomAttributeResponseBody body;

    public static UpdateCustomAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAttributeResponse self = new UpdateCustomAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomAttributeResponse setBody(UpdateCustomAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomAttributeResponseBody getBody() {
        return this.body;
    }

}
