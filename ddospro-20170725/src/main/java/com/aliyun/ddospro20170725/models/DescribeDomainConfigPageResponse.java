// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDomainConfigPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainConfigPageResponseBody body;

    public static DescribeDomainConfigPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainConfigPageResponse self = new DescribeDomainConfigPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainConfigPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainConfigPageResponse setBody(DescribeDomainConfigPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainConfigPageResponseBody getBody() {
        return this.body;
    }

}
