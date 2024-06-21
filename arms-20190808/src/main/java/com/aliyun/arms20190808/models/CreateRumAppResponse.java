// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRumAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRumAppResponseBody body;

    public static CreateRumAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRumAppResponse self = new CreateRumAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateRumAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRumAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRumAppResponse setBody(CreateRumAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRumAppResponseBody getBody() {
        return this.body;
    }

}
