// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLiveDomainMappingResponseBody body;

    public static AddLiveDomainMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainMappingResponse self = new AddLiveDomainMappingResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveDomainMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveDomainMappingResponse setBody(AddLiveDomainMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveDomainMappingResponseBody getBody() {
        return this.body;
    }

}
