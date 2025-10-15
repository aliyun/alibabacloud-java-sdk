// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateDomainIcpNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDomainIcpNumberResponseBody body;

    public static UpdateDomainIcpNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainIcpNumberResponse self = new UpdateDomainIcpNumberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainIcpNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainIcpNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainIcpNumberResponse setBody(UpdateDomainIcpNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainIcpNumberResponseBody getBody() {
        return this.body;
    }

}
