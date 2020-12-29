// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainDnssecStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetDomainDnssecStatusResponse setBody(SetDomainDnssecStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainDnssecStatusResponseBody getBody() {
        return this.body;
    }

}
