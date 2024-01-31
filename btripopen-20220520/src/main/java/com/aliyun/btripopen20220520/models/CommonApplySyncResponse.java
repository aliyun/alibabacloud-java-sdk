// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CommonApplySyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommonApplySyncResponseBody body;

    public static CommonApplySyncResponse build(java.util.Map<String, ?> map) throws Exception {
        CommonApplySyncResponse self = new CommonApplySyncResponse();
        return TeaModel.build(map, self);
    }

    public CommonApplySyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommonApplySyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommonApplySyncResponse setBody(CommonApplySyncResponseBody body) {
        this.body = body;
        return this;
    }
    public CommonApplySyncResponseBody getBody() {
        return this.body;
    }

}
