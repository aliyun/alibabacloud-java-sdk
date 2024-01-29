// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainDnssecStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDomainDnssecStatusResponseBody body;

    public static SetDomainDnssecStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainDnssecStatusResponse self = new SetDomainDnssecStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainDnssecStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainDnssecStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDomainDnssecStatusResponse setBody(SetDomainDnssecStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainDnssecStatusResponseBody getBody() {
        return this.body;
    }

}
