// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreateToolsetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Toolset body;

    public static CreateToolsetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateToolsetResponse self = new CreateToolsetResponse();
        return TeaModel.build(map, self);
    }

    public CreateToolsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateToolsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateToolsetResponse setBody(Toolset body) {
        this.body = body;
        return this;
    }
    public Toolset getBody() {
        return this.body;
    }

}
