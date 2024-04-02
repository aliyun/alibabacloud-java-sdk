// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateCdiBagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCdiBagResponseBody body;

    public static CreateCdiBagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCdiBagResponse self = new CreateCdiBagResponse();
        return TeaModel.build(map, self);
    }

    public CreateCdiBagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCdiBagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCdiBagResponse setBody(CreateCdiBagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCdiBagResponseBody getBody() {
        return this.body;
    }

}
