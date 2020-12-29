// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDomainBackupResponseBody body;

    public static AddDomainBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainBackupResponse self = new AddDomainBackupResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDomainBackupResponse setBody(AddDomainBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDomainBackupResponseBody getBody() {
        return this.body;
    }

}
