// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocOcrResponseBody body;

    public static DocOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        DocOcrResponse self = new DocOcrResponse();
        return TeaModel.build(map, self);
    }

    public DocOcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocOcrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocOcrResponse setBody(DocOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public DocOcrResponseBody getBody() {
        return this.body;
    }

}
