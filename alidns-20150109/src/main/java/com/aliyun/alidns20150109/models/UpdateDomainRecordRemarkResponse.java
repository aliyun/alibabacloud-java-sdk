// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDomainRecordRemarkResponseBody body;

    public static UpdateDomainRecordRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordRemarkResponse self = new UpdateDomainRecordRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainRecordRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainRecordRemarkResponse setBody(UpdateDomainRecordRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainRecordRemarkResponseBody getBody() {
        return this.body;
    }

}
