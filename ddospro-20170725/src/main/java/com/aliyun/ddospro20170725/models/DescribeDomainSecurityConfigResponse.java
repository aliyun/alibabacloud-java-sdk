// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDomainSecurityConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainSecurityConfigResponseBody body;

    public static DescribeDomainSecurityConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecurityConfigResponse self = new DescribeDomainSecurityConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecurityConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSecurityConfigResponse setBody(DescribeDomainSecurityConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSecurityConfigResponseBody getBody() {
        return this.body;
    }

}
