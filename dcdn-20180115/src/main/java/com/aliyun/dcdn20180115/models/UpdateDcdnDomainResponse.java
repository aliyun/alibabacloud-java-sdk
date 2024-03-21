// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDcdnDomainResponseBody body;

    public static UpdateDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnDomainResponse self = new UpdateDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDcdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDcdnDomainResponse setBody(UpdateDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
