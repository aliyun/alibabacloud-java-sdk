// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainPlayMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveDomainPlayMappingResponseBody body;

    public static DeleteLiveDomainPlayMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainPlayMappingResponse self = new DeleteLiveDomainPlayMappingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainPlayMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveDomainPlayMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveDomainPlayMappingResponse setBody(DeleteLiveDomainPlayMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveDomainPlayMappingResponseBody getBody() {
        return this.body;
    }

}
