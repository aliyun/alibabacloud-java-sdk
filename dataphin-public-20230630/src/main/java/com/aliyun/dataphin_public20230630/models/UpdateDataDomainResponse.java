// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataDomainResponseBody body;

    public static UpdateDataDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataDomainResponse self = new UpdateDataDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataDomainResponse setBody(UpdateDataDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataDomainResponseBody getBody() {
        return this.body;
    }

}
