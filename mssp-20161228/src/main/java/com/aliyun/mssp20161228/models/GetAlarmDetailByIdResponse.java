// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetAlarmDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlarmDetailByIdResponseBody body;

    public static GetAlarmDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmDetailByIdResponse self = new GetAlarmDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAlarmDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlarmDetailByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlarmDetailByIdResponse setBody(GetAlarmDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlarmDetailByIdResponseBody getBody() {
        return this.body;
    }

}
