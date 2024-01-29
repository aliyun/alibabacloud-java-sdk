// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDomainRemarkResponseBody body;

    public static UpdateDomainRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRemarkResponse self = new UpdateDomainRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainRemarkResponse setBody(UpdateDomainRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainRemarkResponseBody getBody() {
        return this.body;
    }

}
