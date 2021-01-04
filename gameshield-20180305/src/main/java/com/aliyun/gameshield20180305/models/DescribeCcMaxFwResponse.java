// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcMaxFwResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcMaxFwResponseBody body;

    public static DescribeCcMaxFwResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcMaxFwResponse self = new DescribeCcMaxFwResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcMaxFwResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcMaxFwResponse setBody(DescribeCcMaxFwResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcMaxFwResponseBody getBody() {
        return this.body;
    }

}
