// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateOncallScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOncallScheduleResponseBody body;

    public static CreateOncallScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOncallScheduleResponse self = new CreateOncallScheduleResponse();
        return TeaModel.build(map, self);
    }

    public CreateOncallScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOncallScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOncallScheduleResponse setBody(CreateOncallScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOncallScheduleResponseBody getBody() {
        return this.body;
    }

}
