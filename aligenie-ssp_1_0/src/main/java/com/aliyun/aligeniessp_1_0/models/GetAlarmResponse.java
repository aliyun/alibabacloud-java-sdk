// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlarmResponseBody body;

    public static GetAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmResponse self = new GetAlarmResponse();
        return TeaModel.build(map, self);
    }

    public GetAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlarmResponse setBody(GetAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlarmResponseBody getBody() {
        return this.body;
    }

}
