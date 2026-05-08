// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static UpdateContextResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextResponse self = new UpdateContextResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextResponse setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
