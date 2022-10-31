// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainStagingConfigResponseBody body;

    public static DescribeLiveDomainStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainStagingConfigResponse self = new DescribeLiveDomainStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainStagingConfigResponse setBody(DescribeLiveDomainStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

}
