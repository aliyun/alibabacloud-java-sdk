// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckTransferInFeasibilityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckTransferInFeasibilityResponse setBody(CheckTransferInFeasibilityResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTransferInFeasibilityResponseBody getBody() {
        return this.body;
    }

}
