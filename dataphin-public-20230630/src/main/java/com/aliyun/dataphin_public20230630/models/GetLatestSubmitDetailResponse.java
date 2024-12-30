// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetLatestSubmitDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLatestSubmitDetailResponseBody body;

    public static GetLatestSubmitDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLatestSubmitDetailResponse self = new GetLatestSubmitDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetLatestSubmitDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLatestSubmitDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLatestSubmitDetailResponse setBody(GetLatestSubmitDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLatestSubmitDetailResponseBody getBody() {
        return this.body;
    }

}
