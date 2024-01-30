// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceConsumersPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceConsumersPageResponseBody body;

    public static GetServiceConsumersPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConsumersPageResponse self = new GetServiceConsumersPageResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceConsumersPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceConsumersPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceConsumersPageResponse setBody(GetServiceConsumersPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceConsumersPageResponseBody getBody() {
        return this.body;
    }

}
