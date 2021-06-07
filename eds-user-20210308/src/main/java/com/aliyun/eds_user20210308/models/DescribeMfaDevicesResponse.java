// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeMfaDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMfaDevicesResponseBody body;

    public static DescribeMfaDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMfaDevicesResponse self = new DescribeMfaDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMfaDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMfaDevicesResponse setBody(DescribeMfaDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMfaDevicesResponseBody getBody() {
        return this.body;
    }

}
