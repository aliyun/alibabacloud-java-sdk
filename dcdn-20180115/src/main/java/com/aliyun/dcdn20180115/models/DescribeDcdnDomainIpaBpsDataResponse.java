// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDcdnDomainIpaBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainIpaBpsDataResponse setBody(DescribeDcdnDomainIpaBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainIpaBpsDataResponseBody getBody() {
        return this.body;
    }

}
