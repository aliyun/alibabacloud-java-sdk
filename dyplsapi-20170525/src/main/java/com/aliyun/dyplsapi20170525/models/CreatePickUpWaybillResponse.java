// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePickUpWaybillResponseBody body;

    public static CreatePickUpWaybillResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillResponse self = new CreatePickUpWaybillResponse();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePickUpWaybillResponse setBody(CreatePickUpWaybillResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePickUpWaybillResponseBody getBody() {
        return this.body;
    }

}
