// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeployFileResponseBody body;

    public static DeployFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployFileResponse self = new DeployFileResponse();
        return TeaModel.build(map, self);
    }

    public DeployFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployFileResponse setBody(DeployFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployFileResponseBody getBody() {
        return this.body;
    }

}
