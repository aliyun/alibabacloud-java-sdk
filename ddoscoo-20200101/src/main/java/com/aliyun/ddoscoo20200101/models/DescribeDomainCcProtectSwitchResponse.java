// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainCcProtectSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainCcProtectSwitchResponseBody body;

    public static DescribeDomainCcProtectSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcProtectSwitchResponse self = new DescribeDomainCcProtectSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcProtectSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainCcProtectSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainCcProtectSwitchResponse setBody(DescribeDomainCcProtectSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainCcProtectSwitchResponseBody getBody() {
        return this.body;
    }

}
