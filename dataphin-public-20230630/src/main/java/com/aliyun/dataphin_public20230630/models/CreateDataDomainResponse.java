// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataDomainResponseBody body;

    public static CreateDataDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDomainResponse self = new CreateDataDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataDomainResponse setBody(CreateDataDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataDomainResponseBody getBody() {
        return this.body;
    }

}
