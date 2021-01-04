// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeMianLiuResSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMianLiuResSummaryResponseBody body;

    public static DescribeMianLiuResSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMianLiuResSummaryResponse self = new DescribeMianLiuResSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMianLiuResSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMianLiuResSummaryResponse setBody(DescribeMianLiuResSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMianLiuResSummaryResponseBody getBody() {
        return this.body;
    }

}
