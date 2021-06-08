// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropByMinuteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnUserSecDropByMinuteResponseBody body;

    public static DescribeDcdnUserSecDropByMinuteResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropByMinuteResponse self = new DescribeDcdnUserSecDropByMinuteResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserSecDropByMinuteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserSecDropByMinuteResponse setBody(DescribeDcdnUserSecDropByMinuteResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserSecDropByMinuteResponseBody getBody() {
        return this.body;
    }

}
