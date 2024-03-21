// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnIpaDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDcdnIpaDomainResponseBody body;

    public static UpdateDcdnIpaDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnIpaDomainResponse self = new UpdateDcdnIpaDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnIpaDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDcdnIpaDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDcdnIpaDomainResponse setBody(UpdateDcdnIpaDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

}
