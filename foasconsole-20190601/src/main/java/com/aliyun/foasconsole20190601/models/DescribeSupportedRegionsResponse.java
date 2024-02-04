// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeSupportedRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupportedRegionsResponseBody body;

    public static DescribeSupportedRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedRegionsResponse self = new DescribeSupportedRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportedRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupportedRegionsResponse setBody(DescribeSupportedRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportedRegionsResponseBody getBody() {
        return this.body;
    }

}
