// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocBlocksQueryResponseBody body;

    public static DocBlocksQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksQueryResponse self = new DocBlocksQueryResponse();
        return TeaModel.build(map, self);
    }

    public DocBlocksQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocBlocksQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocBlocksQueryResponse setBody(DocBlocksQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DocBlocksQueryResponseBody getBody() {
        return this.body;
    }

}
