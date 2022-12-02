// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetAlarmStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlarmStatusResponseBody body;

    public static GetAlarmStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmStatusResponse self = new GetAlarmStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAlarmStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlarmStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlarmStatusResponse setBody(GetAlarmStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlarmStatusResponseBody getBody() {
        return this.body;
    }

}
