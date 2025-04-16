// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocUpdateContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocUpdateContentResponseBody body;

    public static DocUpdateContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DocUpdateContentResponse self = new DocUpdateContentResponse();
        return TeaModel.build(map, self);
    }

    public DocUpdateContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocUpdateContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocUpdateContentResponse setBody(DocUpdateContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DocUpdateContentResponseBody getBody() {
        return this.body;
    }

}
