// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageByInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageByInstanceResponseBody body;

    public static CreateImageByInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageByInstanceResponse self = new CreateImageByInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageByInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageByInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageByInstanceResponse setBody(CreateImageByInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageByInstanceResponseBody getBody() {
        return this.body;
    }

}
