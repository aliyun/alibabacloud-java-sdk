// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAclResponseBody body;

    public static CreateAclResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAclResponse self = new CreateAclResponse();
        return TeaModel.build(map, self);
    }

    public CreateAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAclResponse setBody(CreateAclResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAclResponseBody getBody() {
        return this.body;
    }

}
