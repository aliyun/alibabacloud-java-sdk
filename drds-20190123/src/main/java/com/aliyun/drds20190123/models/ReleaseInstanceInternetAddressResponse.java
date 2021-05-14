// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ReleaseInstanceInternetAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseInstanceInternetAddressResponseBody body;

    public static ReleaseInstanceInternetAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceInternetAddressResponse self = new ReleaseInstanceInternetAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceInternetAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseInstanceInternetAddressResponse setBody(ReleaseInstanceInternetAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseInstanceInternetAddressResponseBody getBody() {
        return this.body;
    }

}
