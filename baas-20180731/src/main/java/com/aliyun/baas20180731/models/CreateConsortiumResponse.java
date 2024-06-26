// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConsortiumResponseBody body;

    public static CreateConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsortiumResponse self = new CreateConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsortiumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConsortiumResponse setBody(CreateConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsortiumResponseBody getBody() {
        return this.body;
    }

}
