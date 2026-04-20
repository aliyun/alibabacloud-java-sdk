// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DropUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DropUserResponseBody body;

    public static DropUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DropUserResponse self = new DropUserResponse();
        return TeaModel.build(map, self);
    }

    public DropUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DropUserResponse setBody(DropUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DropUserResponseBody getBody() {
        return this.body;
    }

}
