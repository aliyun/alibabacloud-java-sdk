// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSchedulePeriodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSchedulePeriodResponseBody body;

    public static CreateSchedulePeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulePeriodResponse self = new CreateSchedulePeriodResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchedulePeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchedulePeriodResponse setBody(CreateSchedulePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchedulePeriodResponseBody getBody() {
        return this.body;
    }

}
