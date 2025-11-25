// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddDomainResolveRealtimeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDomainResolveRealtimeTaskResponseBody body;

    public static AddDomainResolveRealtimeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResolveRealtimeTaskResponse self = new AddDomainResolveRealtimeTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainResolveRealtimeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDomainResolveRealtimeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDomainResolveRealtimeTaskResponse setBody(AddDomainResolveRealtimeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDomainResolveRealtimeTaskResponseBody getBody() {
        return this.body;
    }

}
