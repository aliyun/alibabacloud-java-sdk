// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAgenticSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgenticSpaceResponseBody body;

    public static CreateAgenticSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticSpaceResponse self = new CreateAgenticSpaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgenticSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgenticSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgenticSpaceResponse setBody(CreateAgenticSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgenticSpaceResponseBody getBody() {
        return this.body;
    }

}
