// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBrandResponseBody body;

    public static UpdateBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBrandResponse self = new UpdateBrandResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBrandResponse setBody(UpdateBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBrandResponseBody getBody() {
        return this.body;
    }

}
