// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBgpResSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBgpResSummaryResponseBody body;

    public static DescribeBgpResSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpResSummaryResponse self = new DescribeBgpResSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpResSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpResSummaryResponse setBody(DescribeBgpResSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpResSummaryResponseBody getBody() {
        return this.body;
    }

}
