// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSaseUserTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSaseUserTagResponseBody body;

    public static CreateSaseUserTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSaseUserTagResponse self = new CreateSaseUserTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateSaseUserTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSaseUserTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSaseUserTagResponse setBody(CreateSaseUserTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSaseUserTagResponseBody getBody() {
        return this.body;
    }

}
