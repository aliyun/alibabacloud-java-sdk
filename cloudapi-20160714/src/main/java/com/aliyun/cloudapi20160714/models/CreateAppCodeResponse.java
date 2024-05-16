// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAppCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppCodeResponseBody body;

    public static CreateAppCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppCodeResponse self = new CreateAppCodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppCodeResponse setBody(CreateAppCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppCodeResponseBody getBody() {
        return this.body;
    }

}
