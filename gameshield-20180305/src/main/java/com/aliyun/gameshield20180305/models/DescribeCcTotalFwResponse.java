// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcTotalFwResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcTotalFwResponseBody body;

    public static DescribeCcTotalFwResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcTotalFwResponse self = new DescribeCcTotalFwResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcTotalFwResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcTotalFwResponse setBody(DescribeCcTotalFwResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcTotalFwResponseBody getBody() {
        return this.body;
    }

}
