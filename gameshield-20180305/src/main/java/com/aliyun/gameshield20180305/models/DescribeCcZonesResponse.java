// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcZonesResponseBody body;

    public static DescribeCcZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcZonesResponse self = new DescribeCcZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcZonesResponse setBody(DescribeCcZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcZonesResponseBody getBody() {
        return this.body;
    }

}
