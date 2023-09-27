// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DeployApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeployApiResponseBody body;

    public static DeployApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployApiResponse self = new DeployApiResponse();
        return TeaModel.build(map, self);
    }

    public DeployApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployApiResponse setBody(DeployApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployApiResponseBody getBody() {
        return this.body;
    }

}
