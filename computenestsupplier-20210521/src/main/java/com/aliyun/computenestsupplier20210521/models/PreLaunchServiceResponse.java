// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class PreLaunchServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreLaunchServiceResponseBody body;

    public static PreLaunchServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PreLaunchServiceResponse self = new PreLaunchServiceResponse();
        return TeaModel.build(map, self);
    }

    public PreLaunchServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreLaunchServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreLaunchServiceResponse setBody(PreLaunchServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public PreLaunchServiceResponseBody getBody() {
        return this.body;
    }

}
