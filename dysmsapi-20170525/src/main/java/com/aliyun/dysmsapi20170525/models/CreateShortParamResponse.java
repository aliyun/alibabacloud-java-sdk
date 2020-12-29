// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateShortParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateShortParamResponseBody body;

    public static CreateShortParamResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShortParamResponse self = new CreateShortParamResponse();
        return TeaModel.build(map, self);
    }

    public CreateShortParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShortParamResponse setBody(CreateShortParamResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateShortParamResponseBody getBody() {
        return this.body;
    }

}
