// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateIntranetDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIntranetDomainResponseBody body;

    public static CreateIntranetDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntranetDomainResponse self = new CreateIntranetDomainResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntranetDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntranetDomainResponse setBody(CreateIntranetDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntranetDomainResponseBody getBody() {
        return this.body;
    }

}
