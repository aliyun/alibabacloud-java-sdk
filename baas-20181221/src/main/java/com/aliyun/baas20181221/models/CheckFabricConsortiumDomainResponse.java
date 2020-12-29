// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricConsortiumDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckFabricConsortiumDomainResponseBody body;

    public static CheckFabricConsortiumDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricConsortiumDomainResponse self = new CheckFabricConsortiumDomainResponse();
        return TeaModel.build(map, self);
    }

    public CheckFabricConsortiumDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFabricConsortiumDomainResponse setBody(CheckFabricConsortiumDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFabricConsortiumDomainResponseBody getBody() {
        return this.body;
    }

}
