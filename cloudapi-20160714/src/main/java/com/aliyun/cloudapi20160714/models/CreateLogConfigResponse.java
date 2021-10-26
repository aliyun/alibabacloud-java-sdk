// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLogConfigResponseBody body;

    public static CreateLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogConfigResponse self = new CreateLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogConfigResponse setBody(CreateLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogConfigResponseBody getBody() {
        return this.body;
    }

}
