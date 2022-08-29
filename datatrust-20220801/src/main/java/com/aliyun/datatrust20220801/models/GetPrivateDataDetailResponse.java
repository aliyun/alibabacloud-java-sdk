// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetPrivateDataDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrivateDataDetailResponseBody body;

    public static GetPrivateDataDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateDataDetailResponse self = new GetPrivateDataDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetPrivateDataDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrivateDataDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrivateDataDetailResponse setBody(GetPrivateDataDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrivateDataDetailResponseBody getBody() {
        return this.body;
    }

}
