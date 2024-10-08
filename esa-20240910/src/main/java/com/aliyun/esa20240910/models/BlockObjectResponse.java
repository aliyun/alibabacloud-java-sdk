// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BlockObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BlockObjectResponseBody body;

    public static BlockObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        BlockObjectResponse self = new BlockObjectResponse();
        return TeaModel.build(map, self);
    }

    public BlockObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BlockObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BlockObjectResponse setBody(BlockObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public BlockObjectResponseBody getBody() {
        return this.body;
    }

}
