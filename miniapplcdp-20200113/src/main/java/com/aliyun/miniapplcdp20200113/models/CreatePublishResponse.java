// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreatePublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePublishResponseBody body;

    public static CreatePublishResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishResponse self = new CreatePublishResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublishResponse setBody(CreatePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublishResponseBody getBody() {
        return this.body;
    }

}
