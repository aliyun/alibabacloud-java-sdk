// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocOcrMaxResponseBody body;

    public static DocOcrMaxResponse build(java.util.Map<String, ?> map) throws Exception {
        DocOcrMaxResponse self = new DocOcrMaxResponse();
        return TeaModel.build(map, self);
    }

    public DocOcrMaxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocOcrMaxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocOcrMaxResponse setBody(DocOcrMaxResponseBody body) {
        this.body = body;
        return this;
    }
    public DocOcrMaxResponseBody getBody() {
        return this.body;
    }

}
