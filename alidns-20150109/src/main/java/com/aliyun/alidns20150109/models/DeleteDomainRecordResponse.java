// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDomainRecordResponseBody body;

    public static DeleteDomainRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainRecordResponse self = new DeleteDomainRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainRecordResponse setBody(DeleteDomainRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainRecordResponseBody getBody() {
        return this.body;
    }

}
