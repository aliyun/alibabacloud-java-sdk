// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitReturnGoodLogisticsResponseBody body;

    public static SubmitReturnGoodLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogisticsResponse self = new SubmitReturnGoodLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitReturnGoodLogisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitReturnGoodLogisticsResponse setBody(SubmitReturnGoodLogisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitReturnGoodLogisticsResponseBody getBody() {
        return this.body;
    }

}
