// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBpsFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBpsFlowResponseBody body;

    public static DescribeBpsFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBpsFlowResponse self = new DescribeBpsFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBpsFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBpsFlowResponse setBody(DescribeBpsFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBpsFlowResponseBody getBody() {
        return this.body;
    }

}
