// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class CheckTransferInFeasibilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckTransferInFeasibilityResponseBody body;

    public static CheckTransferInFeasibilityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTransferInFeasibilityResponse self = new CheckTransferInFeasibilityResponse();
        return TeaModel.build(map, self);
    }

    public CheckTransferInFeasibilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTransferInFeasibilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckTransferInFeasibilityResponse setBody(CheckTransferInFeasibilityResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTransferInFeasibilityResponseBody getBody() {
        return this.body;
    }

}
