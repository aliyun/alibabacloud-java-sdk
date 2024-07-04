// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeployInstanceSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployInstanceSDGResponseBody body;

    public static DeployInstanceSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployInstanceSDGResponse self = new DeployInstanceSDGResponse();
        return TeaModel.build(map, self);
    }

    public DeployInstanceSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployInstanceSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployInstanceSDGResponse setBody(DeployInstanceSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployInstanceSDGResponseBody getBody() {
        return this.body;
    }

}
