// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class GetAccountReviewRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountReviewRecordResponseBody body;

    public static GetAccountReviewRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountReviewRecordResponse self = new GetAccountReviewRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountReviewRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountReviewRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountReviewRecordResponse setBody(GetAccountReviewRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountReviewRecordResponseBody getBody() {
        return this.body;
    }

}
