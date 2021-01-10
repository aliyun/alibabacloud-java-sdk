// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DescribeMtsUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMtsUserResourcePackageResponse setBody(DescribeMtsUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMtsUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
