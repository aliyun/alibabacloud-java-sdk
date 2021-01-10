// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveDomainMappingResponseBody body;

    public static DeleteLiveDomainMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainMappingResponse self = new DeleteLiveDomainMappingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveDomainMappingResponse setBody(DeleteLiveDomainMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveDomainMappingResponseBody getBody() {
        return this.body;
    }

}
