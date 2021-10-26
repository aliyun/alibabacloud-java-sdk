// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateApiResponseBody body;

    public static CreateApiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiResponse self = new CreateApiResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiResponse setBody(CreateApiResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiResponseBody getBody() {
        return this.body;
    }

}
