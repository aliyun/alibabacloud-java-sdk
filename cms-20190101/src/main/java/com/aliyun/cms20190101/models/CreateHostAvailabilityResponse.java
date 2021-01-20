// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHostAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHostAvailabilityResponseBody body;

    public static CreateHostAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAvailabilityResponse self = new CreateHostAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public CreateHostAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHostAvailabilityResponse setBody(CreateHostAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHostAvailabilityResponseBody getBody() {
        return this.body;
    }

}
