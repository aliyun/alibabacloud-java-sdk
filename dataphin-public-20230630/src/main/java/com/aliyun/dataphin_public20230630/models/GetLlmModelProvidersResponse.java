// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetLlmModelProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLlmModelProvidersResponseBody body;

    public static GetLlmModelProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLlmModelProvidersResponse self = new GetLlmModelProvidersResponse();
        return TeaModel.build(map, self);
    }

    public GetLlmModelProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLlmModelProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLlmModelProvidersResponse setBody(GetLlmModelProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLlmModelProvidersResponseBody getBody() {
        return this.body;
    }

}
