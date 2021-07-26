// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateConfigurationVariateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConfigurationVariateResponseBody body;

    public static CreateConfigurationVariateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationVariateResponse self = new CreateConfigurationVariateResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationVariateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigurationVariateResponse setBody(CreateConfigurationVariateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigurationVariateResponseBody getBody() {
        return this.body;
    }

}
