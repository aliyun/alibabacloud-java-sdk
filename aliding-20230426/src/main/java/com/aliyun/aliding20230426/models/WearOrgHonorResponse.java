// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class WearOrgHonorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public WearOrgHonorResponseBody body;

    public static WearOrgHonorResponse build(java.util.Map<String, ?> map) throws Exception {
        WearOrgHonorResponse self = new WearOrgHonorResponse();
        return TeaModel.build(map, self);
    }

    public WearOrgHonorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WearOrgHonorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WearOrgHonorResponse setBody(WearOrgHonorResponseBody body) {
        this.body = body;
        return this;
    }
    public WearOrgHonorResponseBody getBody() {
        return this.body;
    }

}
