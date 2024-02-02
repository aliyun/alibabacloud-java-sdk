// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSchedulePeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateSchedulePeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSchedulePeriodResponse setBody(UpdateSchedulePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSchedulePeriodResponseBody getBody() {
        return this.body;
    }

}
