// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCustomAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomAttributeResponseBody body;

    public static GetCustomAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAttributeResponse self = new GetCustomAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomAttributeResponse setBody(GetCustomAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomAttributeResponseBody getBody() {
        return this.body;
    }

}
