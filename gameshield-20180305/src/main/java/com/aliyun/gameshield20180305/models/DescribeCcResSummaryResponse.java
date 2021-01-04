// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcResSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcResSummaryResponseBody body;

    public static DescribeCcResSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcResSummaryResponse self = new DescribeCcResSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcResSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcResSummaryResponse setBody(DescribeCcResSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcResSummaryResponseBody getBody() {
        return this.body;
    }

}
