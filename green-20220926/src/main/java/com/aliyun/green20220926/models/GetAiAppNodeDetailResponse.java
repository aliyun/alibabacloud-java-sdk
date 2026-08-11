// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppNodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiAppNodeDetailResponseBody body;

    public static GetAiAppNodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppNodeDetailResponse self = new GetAiAppNodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAiAppNodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiAppNodeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiAppNodeDetailResponse setBody(GetAiAppNodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiAppNodeDetailResponseBody getBody() {
        return this.body;
    }

}
