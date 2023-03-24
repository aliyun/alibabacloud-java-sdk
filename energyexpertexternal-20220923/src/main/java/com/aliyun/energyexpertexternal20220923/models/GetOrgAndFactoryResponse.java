// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetOrgAndFactoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrgAndFactoryResponseBody body;

    public static GetOrgAndFactoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrgAndFactoryResponse self = new GetOrgAndFactoryResponse();
        return TeaModel.build(map, self);
    }

    public GetOrgAndFactoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrgAndFactoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrgAndFactoryResponse setBody(GetOrgAndFactoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrgAndFactoryResponseBody getBody() {
        return this.body;
    }

}
