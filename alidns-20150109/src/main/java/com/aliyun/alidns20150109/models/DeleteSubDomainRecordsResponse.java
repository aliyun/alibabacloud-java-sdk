// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteSubDomainRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSubDomainRecordsResponseBody body;

    public static DeleteSubDomainRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubDomainRecordsResponse self = new DeleteSubDomainRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubDomainRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubDomainRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubDomainRecordsResponse setBody(DeleteSubDomainRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubDomainRecordsResponseBody getBody() {
        return this.body;
    }

}
