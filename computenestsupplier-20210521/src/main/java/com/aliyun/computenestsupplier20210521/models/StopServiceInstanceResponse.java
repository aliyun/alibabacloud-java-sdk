// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class StopServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopServiceInstanceResponseBody body;

    public static StopServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopServiceInstanceResponse self = new StopServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopServiceInstanceResponse setBody(StopServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
