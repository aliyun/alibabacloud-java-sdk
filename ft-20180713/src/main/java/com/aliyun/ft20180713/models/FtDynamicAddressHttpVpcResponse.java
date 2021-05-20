// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressHttpVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FtDynamicAddressHttpVpcResponseBody body;

    public static FtDynamicAddressHttpVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressHttpVpcResponse self = new FtDynamicAddressHttpVpcResponse();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressHttpVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FtDynamicAddressHttpVpcResponse setBody(FtDynamicAddressHttpVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public FtDynamicAddressHttpVpcResponseBody getBody() {
        return this.body;
    }

}
