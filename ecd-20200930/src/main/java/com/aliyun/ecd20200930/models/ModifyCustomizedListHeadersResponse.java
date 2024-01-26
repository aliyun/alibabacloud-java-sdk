// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCustomizedListHeadersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCustomizedListHeadersResponseBody body;

    public static ModifyCustomizedListHeadersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomizedListHeadersResponse self = new ModifyCustomizedListHeadersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomizedListHeadersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomizedListHeadersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomizedListHeadersResponse setBody(ModifyCustomizedListHeadersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomizedListHeadersResponseBody getBody() {
        return this.body;
    }

}
