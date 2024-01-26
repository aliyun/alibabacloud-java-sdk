// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRetcodeAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRetcodeAppResponseBody body;

    public static CreateRetcodeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRetcodeAppResponse self = new CreateRetcodeAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateRetcodeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRetcodeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRetcodeAppResponse setBody(CreateRetcodeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRetcodeAppResponseBody getBody() {
        return this.body;
    }

}
