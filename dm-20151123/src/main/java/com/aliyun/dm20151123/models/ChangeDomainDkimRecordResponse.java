// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ChangeDomainDkimRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeDomainDkimRecordResponseBody body;

    public static ChangeDomainDkimRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainDkimRecordResponse self = new ChangeDomainDkimRecordResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDomainDkimRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDomainDkimRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeDomainDkimRecordResponse setBody(ChangeDomainDkimRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDomainDkimRecordResponseBody getBody() {
        return this.body;
    }

}
