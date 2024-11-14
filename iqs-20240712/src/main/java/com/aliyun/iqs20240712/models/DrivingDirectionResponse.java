// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class DrivingDirectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DrivingDirectionResponseBody body;

    public static DrivingDirectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DrivingDirectionResponse self = new DrivingDirectionResponse();
        return TeaModel.build(map, self);
    }

    public DrivingDirectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DrivingDirectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DrivingDirectionResponse setBody(DrivingDirectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DrivingDirectionResponseBody getBody() {
        return this.body;
    }

}
