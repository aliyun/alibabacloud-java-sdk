// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCcActivityLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainCcActivityLogResponseBody body;

    public static DescribeDcdnDomainCcActivityLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCcActivityLogResponse self = new DescribeDcdnDomainCcActivityLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCcActivityLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainCcActivityLogResponse setBody(DescribeDcdnDomainCcActivityLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainCcActivityLogResponseBody getBody() {
        return this.body;
    }

}
