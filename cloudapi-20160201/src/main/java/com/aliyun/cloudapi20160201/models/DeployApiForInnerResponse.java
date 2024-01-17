// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeployApiForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeployApiForInnerResponseBody body;

    public static DeployApiForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployApiForInnerResponse self = new DeployApiForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DeployApiForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployApiForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployApiForInnerResponse setBody(DeployApiForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployApiForInnerResponseBody getBody() {
        return this.body;
    }

}
