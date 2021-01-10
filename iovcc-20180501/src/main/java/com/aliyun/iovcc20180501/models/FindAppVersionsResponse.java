// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindAppVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindAppVersionsResponseBody body;

    public static FindAppVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        FindAppVersionsResponse self = new FindAppVersionsResponse();
        return TeaModel.build(map, self);
    }

    public FindAppVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindAppVersionsResponse setBody(FindAppVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public FindAppVersionsResponseBody getBody() {
        return this.body;
    }

}
