// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnComputeDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCdnComputeDomainResponseBody body;

    public static CreateCdnComputeDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnComputeDomainResponse self = new CreateCdnComputeDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateCdnComputeDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCdnComputeDomainResponse setBody(CreateCdnComputeDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCdnComputeDomainResponseBody getBody() {
        return this.body;
    }

}
