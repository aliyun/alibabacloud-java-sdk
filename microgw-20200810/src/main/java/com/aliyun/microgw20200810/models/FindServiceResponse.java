// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindServiceResponseBody body;

    public static FindServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        FindServiceResponse self = new FindServiceResponse();
        return TeaModel.build(map, self);
    }

    public FindServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindServiceResponse setBody(FindServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public FindServiceResponseBody getBody() {
        return this.body;
    }

}
