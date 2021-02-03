// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteSubDomainRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteSubDomainRecordsResponse setBody(DeleteSubDomainRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubDomainRecordsResponseBody getBody() {
        return this.body;
    }

}
