// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkAclEntryResponseBody body;

    public static DeleteNetworkAclEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAclEntryResponse self = new DeleteNetworkAclEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAclEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkAclEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkAclEntryResponse setBody(DeleteNetworkAclEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkAclEntryResponseBody getBody() {
        return this.body;
    }

}
