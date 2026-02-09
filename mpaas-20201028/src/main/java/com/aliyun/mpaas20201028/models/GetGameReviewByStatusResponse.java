// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetGameReviewByStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGameReviewByStatusResponseBody body;

    public static GetGameReviewByStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameReviewByStatusResponse self = new GetGameReviewByStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetGameReviewByStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameReviewByStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGameReviewByStatusResponse setBody(GetGameReviewByStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameReviewByStatusResponseBody getBody() {
        return this.body;
    }

}
