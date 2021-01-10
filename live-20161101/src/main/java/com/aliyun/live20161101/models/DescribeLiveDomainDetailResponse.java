// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainDetailResponseBody body;

    public static DescribeLiveDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainDetailResponse self = new DescribeLiveDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainDetailResponse setBody(DescribeLiveDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainDetailResponseBody getBody() {
        return this.body;
    }

}
