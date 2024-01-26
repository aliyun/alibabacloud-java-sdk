// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyAclEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAclEntriesResponseBody body;

    public static ModifyAclEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAclEntriesResponse self = new ModifyAclEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAclEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAclEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAclEntriesResponse setBody(ModifyAclEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAclEntriesResponseBody getBody() {
        return this.body;
    }

}
