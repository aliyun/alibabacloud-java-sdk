// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDomainRecordResponseBody body;

    public static UpdateDomainRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordResponse self = new UpdateDomainRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainRecordResponse setBody(UpdateDomainRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainRecordResponseBody getBody() {
        return this.body;
    }

}
