// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SendCustomIncidentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendCustomIncidentsResponseBody body;

    public static SendCustomIncidentsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCustomIncidentsResponse self = new SendCustomIncidentsResponse();
        return TeaModel.build(map, self);
    }

    public SendCustomIncidentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCustomIncidentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCustomIncidentsResponse setBody(SendCustomIncidentsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCustomIncidentsResponseBody getBody() {
        return this.body;
    }

}
