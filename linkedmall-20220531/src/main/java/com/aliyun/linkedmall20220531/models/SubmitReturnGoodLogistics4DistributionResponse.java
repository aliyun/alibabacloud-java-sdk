// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogistics4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitReturnGoodLogistics4DistributionResponseBody body;

    public static SubmitReturnGoodLogistics4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogistics4DistributionResponse self = new SubmitReturnGoodLogistics4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogistics4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitReturnGoodLogistics4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitReturnGoodLogistics4DistributionResponse setBody(SubmitReturnGoodLogistics4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitReturnGoodLogistics4DistributionResponseBody getBody() {
        return this.body;
    }

}
