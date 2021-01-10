// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveTopDomainsByFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveTopDomainsByFlowResponseBody body;

    public static DescribeLiveTopDomainsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveTopDomainsByFlowResponse self = new DescribeLiveTopDomainsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveTopDomainsByFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveTopDomainsByFlowResponse setBody(DescribeLiveTopDomainsByFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveTopDomainsByFlowResponseBody getBody() {
        return this.body;
    }

}
