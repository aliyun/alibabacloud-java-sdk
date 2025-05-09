// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDifyRegionsResponseBody body;

    public static DescribeDifyRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyRegionsResponse self = new DescribeDifyRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDifyRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDifyRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDifyRegionsResponse setBody(DescribeDifyRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDifyRegionsResponseBody getBody() {
        return this.body;
    }

}
