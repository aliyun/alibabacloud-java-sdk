// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalQueryResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TotalQueryResourcePackageResponseBody body;

    public static TotalQueryResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        TotalQueryResourcePackageResponse self = new TotalQueryResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public TotalQueryResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TotalQueryResourcePackageResponse setBody(TotalQueryResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public TotalQueryResourcePackageResponseBody getBody() {
        return this.body;
    }

}
