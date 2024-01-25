// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddBusinessGroupOneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBusinessGroupOneResponseBody body;

    public static AddBusinessGroupOneResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessGroupOneResponse self = new AddBusinessGroupOneResponse();
        return TeaModel.build(map, self);
    }

    public AddBusinessGroupOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBusinessGroupOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBusinessGroupOneResponse setBody(AddBusinessGroupOneResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBusinessGroupOneResponseBody getBody() {
        return this.body;
    }

}
