// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddProjectManagerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddProjectManagerResponseBody body;

    public static AddProjectManagerResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProjectManagerResponse self = new AddProjectManagerResponse();
        return TeaModel.build(map, self);
    }

    public AddProjectManagerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProjectManagerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProjectManagerResponse setBody(AddProjectManagerResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProjectManagerResponseBody getBody() {
        return this.body;
    }

}
