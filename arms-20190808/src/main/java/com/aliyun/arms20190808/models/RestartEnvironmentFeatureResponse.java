// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RestartEnvironmentFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartEnvironmentFeatureResponseBody body;

    public static RestartEnvironmentFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartEnvironmentFeatureResponse self = new RestartEnvironmentFeatureResponse();
        return TeaModel.build(map, self);
    }

    public RestartEnvironmentFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartEnvironmentFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartEnvironmentFeatureResponse setBody(RestartEnvironmentFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartEnvironmentFeatureResponseBody getBody() {
        return this.body;
    }

}
