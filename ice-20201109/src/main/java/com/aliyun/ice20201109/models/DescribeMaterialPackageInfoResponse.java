// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMaterialPackageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMaterialPackageInfoResponseBody body;

    public static DescribeMaterialPackageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaterialPackageInfoResponse self = new DescribeMaterialPackageInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMaterialPackageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMaterialPackageInfoResponse setBody(DescribeMaterialPackageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMaterialPackageInfoResponseBody getBody() {
        return this.body;
    }

}
