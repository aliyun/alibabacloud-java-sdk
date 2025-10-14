// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocBlocksDeleteResponseBody body;

    public static DocBlocksDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksDeleteResponse self = new DocBlocksDeleteResponse();
        return TeaModel.build(map, self);
    }

    public DocBlocksDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocBlocksDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocBlocksDeleteResponse setBody(DocBlocksDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public DocBlocksDeleteResponseBody getBody() {
        return this.body;
    }

}
