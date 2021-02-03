// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDomainRecordResponseBody body;

    public static AddDomainRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRecordResponse self = new AddDomainRecordResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDomainRecordResponse setBody(AddDomainRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDomainRecordResponseBody getBody() {
        return this.body;
    }

}
