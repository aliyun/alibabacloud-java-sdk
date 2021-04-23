// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeDRMCertListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDRMCertListResponseBody body;

    public static DescribeDRMCertListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDRMCertListResponse self = new DescribeDRMCertListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDRMCertListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDRMCertListResponse setBody(DescribeDRMCertListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDRMCertListResponseBody getBody() {
        return this.body;
    }

}
