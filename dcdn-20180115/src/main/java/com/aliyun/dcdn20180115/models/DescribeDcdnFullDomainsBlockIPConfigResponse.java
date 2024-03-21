// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnFullDomainsBlockIPConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnFullDomainsBlockIPConfigResponseBody body;

    public static DescribeDcdnFullDomainsBlockIPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnFullDomainsBlockIPConfigResponse self = new DescribeDcdnFullDomainsBlockIPConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnFullDomainsBlockIPConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnFullDomainsBlockIPConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnFullDomainsBlockIPConfigResponse setBody(DescribeDcdnFullDomainsBlockIPConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnFullDomainsBlockIPConfigResponseBody getBody() {
        return this.body;
    }

}
