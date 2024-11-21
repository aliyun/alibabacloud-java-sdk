// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOriginProtectionResponseBody body;

    public static UpdateOriginProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginProtectionResponse self = new UpdateOriginProtectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOriginProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOriginProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOriginProtectionResponse setBody(UpdateOriginProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOriginProtectionResponseBody getBody() {
        return this.body;
    }

}
