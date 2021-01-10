// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionTestsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindVersionTestsResponseBody body;

    public static FindVersionTestsResponse build(java.util.Map<String, ?> map) throws Exception {
        FindVersionTestsResponse self = new FindVersionTestsResponse();
        return TeaModel.build(map, self);
    }

    public FindVersionTestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindVersionTestsResponse setBody(FindVersionTestsResponseBody body) {
        this.body = body;
        return this;
    }
    public FindVersionTestsResponseBody getBody() {
        return this.body;
    }

}
