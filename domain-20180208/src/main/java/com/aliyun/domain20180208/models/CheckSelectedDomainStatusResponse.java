// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckSelectedDomainStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSelectedDomainStatusResponseBody body;

    public static CheckSelectedDomainStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSelectedDomainStatusResponse self = new CheckSelectedDomainStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckSelectedDomainStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSelectedDomainStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSelectedDomainStatusResponse setBody(CheckSelectedDomainStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSelectedDomainStatusResponseBody getBody() {
        return this.body;
    }

}
