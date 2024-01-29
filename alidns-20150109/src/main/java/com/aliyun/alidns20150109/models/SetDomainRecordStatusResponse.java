// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainRecordStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDomainRecordStatusResponseBody body;

    public static SetDomainRecordStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRecordStatusResponse self = new SetDomainRecordStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainRecordStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainRecordStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDomainRecordStatusResponse setBody(SetDomainRecordStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainRecordStatusResponseBody getBody() {
        return this.body;
    }

}
