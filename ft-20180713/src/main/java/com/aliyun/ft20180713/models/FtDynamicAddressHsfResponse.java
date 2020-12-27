// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressHsfResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FtDynamicAddressHsfResponseBody body;

    public static FtDynamicAddressHsfResponse build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressHsfResponse self = new FtDynamicAddressHsfResponse();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressHsfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FtDynamicAddressHsfResponse setBody(FtDynamicAddressHsfResponseBody body) {
        this.body = body;
        return this;
    }
    public FtDynamicAddressHsfResponseBody getBody() {
        return this.body;
    }

}
