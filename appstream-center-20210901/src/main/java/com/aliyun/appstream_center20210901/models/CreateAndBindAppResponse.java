// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAndBindAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAndBindAppResponseBody body;

    public static CreateAndBindAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndBindAppResponse self = new CreateAndBindAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndBindAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndBindAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndBindAppResponse setBody(CreateAndBindAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndBindAppResponseBody getBody() {
        return this.body;
    }

}
