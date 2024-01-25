// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAiopsEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiopsEventListResponseBody body;

    public static GetAiopsEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiopsEventListResponse self = new GetAiopsEventListResponse();
        return TeaModel.build(map, self);
    }

    public GetAiopsEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiopsEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiopsEventListResponse setBody(GetAiopsEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiopsEventListResponseBody getBody() {
        return this.body;
    }

}
