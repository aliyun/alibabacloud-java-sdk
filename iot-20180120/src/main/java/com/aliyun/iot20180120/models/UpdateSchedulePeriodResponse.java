// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSchedulePeriodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSchedulePeriodResponseBody body;

    public static UpdateSchedulePeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchedulePeriodResponse self = new UpdateSchedulePeriodResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSchedulePeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSchedulePeriodResponse setBody(UpdateSchedulePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSchedulePeriodResponseBody getBody() {
        return this.body;
    }

}
