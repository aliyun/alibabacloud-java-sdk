// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeploySDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeploySDGResponseBody body;

    public static DeploySDGResponse build(java.util.Map<String, ?> map) throws Exception {
        DeploySDGResponse self = new DeploySDGResponse();
        return TeaModel.build(map, self);
    }

    public DeploySDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeploySDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeploySDGResponse setBody(DeploySDGResponseBody body) {
        this.body = body;
        return this;
    }
    public DeploySDGResponseBody getBody() {
        return this.body;
    }

}
