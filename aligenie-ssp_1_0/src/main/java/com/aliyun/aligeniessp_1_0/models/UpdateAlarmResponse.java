// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UpdateAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAlarmResponseBody body;

    public static UpdateAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmResponse self = new UpdateAlarmResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlarmResponse setBody(UpdateAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlarmResponseBody getBody() {
        return this.body;
    }

}
