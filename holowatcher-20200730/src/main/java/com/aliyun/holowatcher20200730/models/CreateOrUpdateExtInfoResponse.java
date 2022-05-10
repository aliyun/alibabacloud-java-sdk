// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateOrUpdateExtInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateExtInfoResponseBody body;

    public static CreateOrUpdateExtInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateExtInfoResponse self = new CreateOrUpdateExtInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateExtInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateExtInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateExtInfoResponse setBody(CreateOrUpdateExtInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateExtInfoResponseBody getBody() {
        return this.body;
    }

}
