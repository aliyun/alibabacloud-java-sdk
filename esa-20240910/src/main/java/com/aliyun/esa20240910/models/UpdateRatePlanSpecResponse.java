// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRatePlanSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRatePlanSpecResponseBody body;

    public static UpdateRatePlanSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRatePlanSpecResponse self = new UpdateRatePlanSpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRatePlanSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRatePlanSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRatePlanSpecResponse setBody(UpdateRatePlanSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRatePlanSpecResponseBody getBody() {
        return this.body;
    }

}
