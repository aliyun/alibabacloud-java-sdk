// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class GetFlinkAiServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFlinkAiServiceResponseBody body;

    public static GetFlinkAiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlinkAiServiceResponse self = new GetFlinkAiServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetFlinkAiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlinkAiServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlinkAiServiceResponse setBody(GetFlinkAiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlinkAiServiceResponseBody getBody() {
        return this.body;
    }

}
