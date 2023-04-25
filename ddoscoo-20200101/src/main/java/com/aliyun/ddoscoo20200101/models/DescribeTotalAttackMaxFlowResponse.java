// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTotalAttackMaxFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTotalAttackMaxFlowResponseBody body;

    public static DescribeTotalAttackMaxFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalAttackMaxFlowResponse self = new DescribeTotalAttackMaxFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTotalAttackMaxFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTotalAttackMaxFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTotalAttackMaxFlowResponse setBody(DescribeTotalAttackMaxFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTotalAttackMaxFlowResponseBody getBody() {
        return this.body;
    }

}
