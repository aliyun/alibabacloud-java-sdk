// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateTimePeriodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTimePeriodResponseBody body;

    public static CreateTimePeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTimePeriodResponse self = new CreateTimePeriodResponse();
        return TeaModel.build(map, self);
    }

    public CreateTimePeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTimePeriodResponse setBody(CreateTimePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTimePeriodResponseBody getBody() {
        return this.body;
    }

}
