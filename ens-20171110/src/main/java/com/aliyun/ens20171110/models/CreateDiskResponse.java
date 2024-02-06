// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDiskResponseBody body;

    public static CreateDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskResponse self = new CreateDiskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiskResponse setBody(CreateDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiskResponseBody getBody() {
        return this.body;
    }

}
