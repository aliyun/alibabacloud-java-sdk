// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressDubboResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FtDynamicAddressDubboResponseBody body;

    public static FtDynamicAddressDubboResponse build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressDubboResponse self = new FtDynamicAddressDubboResponse();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressDubboResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FtDynamicAddressDubboResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FtDynamicAddressDubboResponse setBody(FtDynamicAddressDubboResponseBody body) {
        this.body = body;
        return this;
    }
    public FtDynamicAddressDubboResponseBody getBody() {
        return this.body;
    }

}
