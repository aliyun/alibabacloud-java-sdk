// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveEntriesFromAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveEntriesFromAclResponse setBody(RemoveEntriesFromAclResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEntriesFromAclResponseBody getBody() {
        return this.body;
    }

}
