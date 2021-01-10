// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainPlayMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveDomainPlayMappingResponseBody body;

    public static AddLiveDomainPlayMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainPlayMappingResponse self = new AddLiveDomainPlayMappingResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainPlayMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveDomainPlayMappingResponse setBody(AddLiveDomainPlayMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveDomainPlayMappingResponseBody getBody() {
        return this.body;
    }

}
