// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainIpaBpsDataResponseBody body;

    public static DescribeDcdnDomainIpaBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaBpsDataResponse self = new DescribeDcdnDomainIpaBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainIpaBpsDataResponse setBody(DescribeDcdnDomainIpaBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainIpaBpsDataResponseBody getBody() {
        return this.body;
    }

}
