// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateLoginProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLoginProfileResponseBody body;

    public static CreateLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileResponse self = new CreateLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoginProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoginProfileResponse setBody(CreateLoginProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoginProfileResponseBody getBody() {
        return this.body;
    }

}
