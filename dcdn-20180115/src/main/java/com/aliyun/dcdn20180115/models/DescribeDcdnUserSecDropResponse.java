// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnUserSecDropResponseBody body;

    public static DescribeDcdnUserSecDropResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropResponse self = new DescribeDcdnUserSecDropResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserSecDropResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserSecDropResponse setBody(DescribeDcdnUserSecDropResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserSecDropResponseBody getBody() {
        return this.body;
    }

}
