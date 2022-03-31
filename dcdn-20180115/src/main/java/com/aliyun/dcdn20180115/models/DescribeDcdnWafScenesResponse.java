// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnWafScenesResponseBody body;

    public static DescribeDcdnWafScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafScenesResponse self = new DescribeDcdnWafScenesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafScenesResponse setBody(DescribeDcdnWafScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafScenesResponseBody getBody() {
        return this.body;
    }

}
