// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkAclEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkAclEntryResponseBody body;

    public static CreateNetworkAclEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclEntryResponse self = new CreateNetworkAclEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAclEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkAclEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkAclEntryResponse setBody(CreateNetworkAclEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkAclEntryResponseBody getBody() {
        return this.body;
    }

}
