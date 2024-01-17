// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPropertiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPropertiesResponseBody body;

    public static GetPropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPropertiesResponse self = new GetPropertiesResponse();
        return TeaModel.build(map, self);
    }

    public GetPropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPropertiesResponse setBody(GetPropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPropertiesResponseBody getBody() {
        return this.body;
    }

}
