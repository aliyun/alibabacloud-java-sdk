// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAlertEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertEventResponseBody body;

    public static GetAlertEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertEventResponse self = new GetAlertEventResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertEventResponse setBody(GetAlertEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertEventResponseBody getBody() {
        return this.body;
    }

}
