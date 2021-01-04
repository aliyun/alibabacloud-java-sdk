// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcFlowResponseBody body;

    public static DescribeCcFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcFlowResponse self = new DescribeCcFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcFlowResponse setBody(DescribeCcFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcFlowResponseBody getBody() {
        return this.body;
    }

}
