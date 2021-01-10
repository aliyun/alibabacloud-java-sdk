// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainMappingResponseBody body;

    public static DescribeLiveDomainMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMappingResponse self = new DescribeLiveDomainMappingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainMappingResponse setBody(DescribeLiveDomainMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainMappingResponseBody getBody() {
        return this.body;
    }

}
