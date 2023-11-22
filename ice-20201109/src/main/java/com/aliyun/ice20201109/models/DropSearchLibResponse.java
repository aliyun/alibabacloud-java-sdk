// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DropSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DropSearchLibResponseBody body;

    public static DropSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DropSearchLibResponse self = new DropSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public DropSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DropSearchLibResponse setBody(DropSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DropSearchLibResponseBody getBody() {
        return this.body;
    }

}
