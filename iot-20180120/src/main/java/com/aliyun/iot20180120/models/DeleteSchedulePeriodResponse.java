// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSchedulePeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSchedulePeriodResponseBody body;

    public static DeleteSchedulePeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedulePeriodResponse self = new DeleteSchedulePeriodResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchedulePeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchedulePeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchedulePeriodResponse setBody(DeleteSchedulePeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchedulePeriodResponseBody getBody() {
        return this.body;
    }

}
