// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateTrafficControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrafficControlResponseBody body;

    public static CreateTrafficControlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlResponse self = new CreateTrafficControlResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrafficControlResponse setBody(CreateTrafficControlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficControlResponseBody getBody() {
        return this.body;
    }

}
