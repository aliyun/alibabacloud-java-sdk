// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class GetFlinkAiServiceFreeQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFlinkAiServiceFreeQuotaResponseBody body;

    public static GetFlinkAiServiceFreeQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlinkAiServiceFreeQuotaResponse self = new GetFlinkAiServiceFreeQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetFlinkAiServiceFreeQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlinkAiServiceFreeQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlinkAiServiceFreeQuotaResponse setBody(GetFlinkAiServiceFreeQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlinkAiServiceFreeQuotaResponseBody getBody() {
        return this.body;
    }

}
