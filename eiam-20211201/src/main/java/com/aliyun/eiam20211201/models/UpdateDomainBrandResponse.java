// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateDomainBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDomainBrandResponseBody body;

    public static UpdateDomainBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainBrandResponse self = new UpdateDomainBrandResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainBrandResponse setBody(UpdateDomainBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainBrandResponseBody getBody() {
        return this.body;
    }

}
