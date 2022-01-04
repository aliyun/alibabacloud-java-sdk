// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateMenuDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMenuDataResponseBody body;

    public static CreateMenuDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMenuDataResponse self = new CreateMenuDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateMenuDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMenuDataResponse setBody(CreateMenuDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMenuDataResponseBody getBody() {
        return this.body;
    }

}
