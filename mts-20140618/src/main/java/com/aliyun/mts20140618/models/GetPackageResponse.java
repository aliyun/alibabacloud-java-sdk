// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class GetPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPackageResponseBody body;

    public static GetPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPackageResponse self = new GetPackageResponse();
        return TeaModel.build(map, self);
    }

    public GetPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPackageResponse setBody(GetPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPackageResponseBody getBody() {
        return this.body;
    }

}
