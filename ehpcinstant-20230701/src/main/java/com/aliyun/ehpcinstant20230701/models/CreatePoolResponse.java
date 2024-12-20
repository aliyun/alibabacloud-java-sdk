// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreatePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePoolResponseBody body;

    public static CreatePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePoolResponse self = new CreatePoolResponse();
        return TeaModel.build(map, self);
    }

    public CreatePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePoolResponse setBody(CreatePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePoolResponseBody getBody() {
        return this.body;
    }

}
