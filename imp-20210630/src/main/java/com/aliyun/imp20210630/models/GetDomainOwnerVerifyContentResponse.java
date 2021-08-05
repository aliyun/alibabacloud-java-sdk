// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetDomainOwnerVerifyContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainOwnerVerifyContentResponseBody body;

    public static GetDomainOwnerVerifyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainOwnerVerifyContentResponse self = new GetDomainOwnerVerifyContentResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainOwnerVerifyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainOwnerVerifyContentResponse setBody(GetDomainOwnerVerifyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainOwnerVerifyContentResponseBody getBody() {
        return this.body;
    }

}
