// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetLlmModelProviderByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLlmModelProviderByNameResponseBody body;

    public static GetLlmModelProviderByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLlmModelProviderByNameResponse self = new GetLlmModelProviderByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetLlmModelProviderByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLlmModelProviderByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLlmModelProviderByNameResponse setBody(GetLlmModelProviderByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLlmModelProviderByNameResponseBody getBody() {
        return this.body;
    }

}
