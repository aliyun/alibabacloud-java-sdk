// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeSupportedZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupportedZonesResponseBody body;

    public static DescribeSupportedZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedZonesResponse self = new DescribeSupportedZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportedZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupportedZonesResponse setBody(DescribeSupportedZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportedZonesResponseBody getBody() {
        return this.body;
    }

}
