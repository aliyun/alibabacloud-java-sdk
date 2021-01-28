// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainStagingConfigResponseBody body;

    public static DescribeDcdnDomainStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainStagingConfigResponse self = new DescribeDcdnDomainStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainStagingConfigResponse setBody(DescribeDcdnDomainStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

}
