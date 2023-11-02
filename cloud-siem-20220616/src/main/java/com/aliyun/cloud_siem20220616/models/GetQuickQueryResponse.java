// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetQuickQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQuickQueryResponseBody body;

    public static GetQuickQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuickQueryResponse self = new GetQuickQueryResponse();
        return TeaModel.build(map, self);
    }

    public GetQuickQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuickQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuickQueryResponse setBody(GetQuickQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuickQueryResponseBody getBody() {
        return this.body;
    }

}
