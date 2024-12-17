// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAnchorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAnchorResponseBody body;

    public static CreateAnchorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAnchorResponse self = new CreateAnchorResponse();
        return TeaModel.build(map, self);
    }

    public CreateAnchorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAnchorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAnchorResponse setBody(CreateAnchorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAnchorResponseBody getBody() {
        return this.body;
    }

}
