// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetExtensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetExtensionResponseBody body;

    public static GetExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExtensionResponse self = new GetExtensionResponse();
        return TeaModel.build(map, self);
    }

    public GetExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExtensionResponse setBody(GetExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExtensionResponseBody getBody() {
        return this.body;
    }

}
