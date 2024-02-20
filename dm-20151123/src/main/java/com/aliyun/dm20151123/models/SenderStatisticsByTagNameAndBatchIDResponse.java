// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SenderStatisticsByTagNameAndBatchIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SenderStatisticsByTagNameAndBatchIDResponseBody body;

    public static SenderStatisticsByTagNameAndBatchIDResponse build(java.util.Map<String, ?> map) throws Exception {
        SenderStatisticsByTagNameAndBatchIDResponse self = new SenderStatisticsByTagNameAndBatchIDResponse();
        return TeaModel.build(map, self);
    }

    public SenderStatisticsByTagNameAndBatchIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SenderStatisticsByTagNameAndBatchIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SenderStatisticsByTagNameAndBatchIDResponse setBody(SenderStatisticsByTagNameAndBatchIDResponseBody body) {
        this.body = body;
        return this;
    }
    public SenderStatisticsByTagNameAndBatchIDResponseBody getBody() {
        return this.body;
    }

}
