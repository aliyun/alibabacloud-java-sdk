// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetSubnetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubnetResponseBody body;

    public static GetSubnetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubnetResponse self = new GetSubnetResponse();
        return TeaModel.build(map, self);
    }

    public GetSubnetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubnetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubnetResponse setBody(GetSubnetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubnetResponseBody getBody() {
        return this.body;
    }

}
