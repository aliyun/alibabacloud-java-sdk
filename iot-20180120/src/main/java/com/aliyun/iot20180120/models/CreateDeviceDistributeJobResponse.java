// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceDistributeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeviceDistributeJobResponseBody body;

    public static CreateDeviceDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceDistributeJobResponse self = new CreateDeviceDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceDistributeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceDistributeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeviceDistributeJobResponse setBody(CreateDeviceDistributeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceDistributeJobResponseBody getBody() {
        return this.body;
    }

}
