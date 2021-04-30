// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveEntriesFromAclResponseBody body;

    public static RemoveEntriesFromAclResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntriesFromAclResponse self = new RemoveEntriesFromAclResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEntriesFromAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEntriesFromAclResponse setBody(RemoveEntriesFromAclResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEntriesFromAclResponseBody getBody() {
        return this.body;
    }

}
