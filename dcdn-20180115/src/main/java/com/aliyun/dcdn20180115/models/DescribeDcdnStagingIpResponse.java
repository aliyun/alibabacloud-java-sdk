// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnStagingIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnStagingIpResponseBody body;

    public static DescribeDcdnStagingIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnStagingIpResponse self = new DescribeDcdnStagingIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnStagingIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnStagingIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnStagingIpResponse setBody(DescribeDcdnStagingIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnStagingIpResponseBody getBody() {
        return this.body;
    }

}
