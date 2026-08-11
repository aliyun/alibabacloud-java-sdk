// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDomainMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDomainMetaResponseBody body;

    public static UpdateDomainMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainMetaResponse self = new UpdateDomainMetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainMetaResponse setBody(UpdateDomainMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainMetaResponseBody getBody() {
        return this.body;
    }

}
