// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class FindActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindActivityResponseBody body;

    public static FindActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        FindActivityResponse self = new FindActivityResponse();
        return TeaModel.build(map, self);
    }

    public FindActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindActivityResponse setBody(FindActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public FindActivityResponseBody getBody() {
        return this.body;
    }

}
