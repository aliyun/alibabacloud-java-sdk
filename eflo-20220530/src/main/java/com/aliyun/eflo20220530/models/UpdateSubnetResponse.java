// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateSubnetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSubnetResponseBody body;

    public static UpdateSubnetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubnetResponse self = new UpdateSubnetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSubnetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSubnetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSubnetResponse setBody(UpdateSubnetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubnetResponseBody getBody() {
        return this.body;
    }

}
