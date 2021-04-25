// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ParseAppInputsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ParseAppInputsResponseBody body;

    public static ParseAppInputsResponse build(java.util.Map<String, ?> map) throws Exception {
        ParseAppInputsResponse self = new ParseAppInputsResponse();
        return TeaModel.build(map, self);
    }

    public ParseAppInputsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ParseAppInputsResponse setBody(ParseAppInputsResponseBody body) {
        this.body = body;
        return this;
    }
    public ParseAppInputsResponseBody getBody() {
        return this.body;
    }

}
