// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSitePairInfoResponseBody body;

    public static DescribeSitePairInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairInfoResponse self = new DescribeSitePairInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSitePairInfoResponse setBody(DescribeSitePairInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSitePairInfoResponseBody getBody() {
        return this.body;
    }

}
