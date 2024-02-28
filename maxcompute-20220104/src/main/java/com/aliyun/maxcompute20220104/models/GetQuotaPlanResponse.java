// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQuotaPlanResponseBody body;

    public static GetQuotaPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaPlanResponse self = new GetQuotaPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaPlanResponse setBody(GetQuotaPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaPlanResponseBody getBody() {
        return this.body;
    }

}
