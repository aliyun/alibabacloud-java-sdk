// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class HistoryThreeElementsVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HistoryThreeElementsVerificationResponseBody body;

    public static HistoryThreeElementsVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        HistoryThreeElementsVerificationResponse self = new HistoryThreeElementsVerificationResponse();
        return TeaModel.build(map, self);
    }

    public HistoryThreeElementsVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HistoryThreeElementsVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HistoryThreeElementsVerificationResponse setBody(HistoryThreeElementsVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public HistoryThreeElementsVerificationResponseBody getBody() {
        return this.body;
    }

}
