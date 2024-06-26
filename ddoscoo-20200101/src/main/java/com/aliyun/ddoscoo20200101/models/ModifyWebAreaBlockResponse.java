// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebAreaBlockResponseBody body;

    public static ModifyWebAreaBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAreaBlockResponse self = new ModifyWebAreaBlockResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebAreaBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebAreaBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebAreaBlockResponse setBody(ModifyWebAreaBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebAreaBlockResponseBody getBody() {
        return this.body;
    }

}
