// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePackageConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLivePackageConfigResponseBody body;

    public static DescribeLivePackageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePackageConfigResponse self = new DescribeLivePackageConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePackageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePackageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePackageConfigResponse setBody(DescribeLivePackageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePackageConfigResponseBody getBody() {
        return this.body;
    }

}
