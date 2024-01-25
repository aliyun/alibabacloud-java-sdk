// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAiopsEventNewListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiopsEventNewListResponseBody body;

    public static GetAiopsEventNewListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiopsEventNewListResponse self = new GetAiopsEventNewListResponse();
        return TeaModel.build(map, self);
    }

    public GetAiopsEventNewListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiopsEventNewListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiopsEventNewListResponse setBody(GetAiopsEventNewListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiopsEventNewListResponseBody getBody() {
        return this.body;
    }

}
