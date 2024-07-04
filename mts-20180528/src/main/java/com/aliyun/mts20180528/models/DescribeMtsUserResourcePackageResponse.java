// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class DescribeMtsUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMtsUserResourcePackageResponseBody body;

    public static DescribeMtsUserResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMtsUserResourcePackageResponse self = new DescribeMtsUserResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMtsUserResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMtsUserResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMtsUserResourcePackageResponse setBody(DescribeMtsUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMtsUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
