// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSemanticJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSemanticJobDetailResponseBody body;

    public static GetSemanticJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSemanticJobDetailResponse self = new GetSemanticJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSemanticJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSemanticJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSemanticJobDetailResponse setBody(GetSemanticJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSemanticJobDetailResponseBody getBody() {
        return this.body;
    }

}
