// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class HandPostureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandPostureResponseBody body;

    public static HandPostureResponse build(java.util.Map<String, ?> map) throws Exception {
        HandPostureResponse self = new HandPostureResponse();
        return TeaModel.build(map, self);
    }

    public HandPostureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandPostureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandPostureResponse setBody(HandPostureResponseBody body) {
        this.body = body;
        return this;
    }
    public HandPostureResponseBody getBody() {
        return this.body;
    }

}
