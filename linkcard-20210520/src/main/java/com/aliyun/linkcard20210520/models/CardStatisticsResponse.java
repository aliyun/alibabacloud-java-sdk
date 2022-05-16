// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class CardStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CardStatisticsResponseBody body;

    public static CardStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        CardStatisticsResponse self = new CardStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public CardStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CardStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CardStatisticsResponse setBody(CardStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public CardStatisticsResponseBody getBody() {
        return this.body;
    }

}
