// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePrefixListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePrefixListResponseBody body;

    public static CreatePrefixListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrefixListResponse self = new CreatePrefixListResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrefixListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrefixListResponse setBody(CreatePrefixListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrefixListResponseBody getBody() {
        return this.body;
    }

}
