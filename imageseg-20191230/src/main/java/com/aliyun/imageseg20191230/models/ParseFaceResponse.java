// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ParseFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ParseFaceResponseBody body;

    public static ParseFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ParseFaceResponse self = new ParseFaceResponse();
        return TeaModel.build(map, self);
    }

    public ParseFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ParseFaceResponse setBody(ParseFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ParseFaceResponseBody getBody() {
        return this.body;
    }

}
