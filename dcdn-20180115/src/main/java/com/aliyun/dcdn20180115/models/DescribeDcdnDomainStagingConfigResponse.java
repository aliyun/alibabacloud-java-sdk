// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDcdnDomainStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainStagingConfigResponse setBody(DescribeDcdnDomainStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

}
