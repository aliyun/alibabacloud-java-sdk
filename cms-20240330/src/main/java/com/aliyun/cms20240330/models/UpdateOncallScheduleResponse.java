// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateOncallScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOncallScheduleResponseBody body;

    public static UpdateOncallScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOncallScheduleResponse self = new UpdateOncallScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOncallScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOncallScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOncallScheduleResponse setBody(UpdateOncallScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOncallScheduleResponseBody getBody() {
        return this.body;
    }

}
