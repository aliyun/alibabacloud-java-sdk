// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQualityProjectDetailResponseBody body;

    public static GetQualityProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectDetailResponse self = new GetQualityProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityProjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityProjectDetailResponse setBody(GetQualityProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityProjectDetailResponseBody getBody() {
        return this.body;
    }

}
