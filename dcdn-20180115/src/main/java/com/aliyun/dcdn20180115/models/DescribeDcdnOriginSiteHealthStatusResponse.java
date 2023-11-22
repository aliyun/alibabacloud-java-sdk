// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOriginSiteHealthStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnOriginSiteHealthStatusResponseBody body;

    public static DescribeDcdnOriginSiteHealthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOriginSiteHealthStatusResponse self = new DescribeDcdnOriginSiteHealthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOriginSiteHealthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnOriginSiteHealthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnOriginSiteHealthStatusResponse setBody(DescribeDcdnOriginSiteHealthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnOriginSiteHealthStatusResponseBody getBody() {
        return this.body;
    }

}
