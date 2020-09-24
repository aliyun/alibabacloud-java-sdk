// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindApisByPagingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindApisByPagingResponseBody body;

    public static FindApisByPagingResponse build(java.util.Map<String, ?> map) throws Exception {
        FindApisByPagingResponse self = new FindApisByPagingResponse();
        return TeaModel.build(map, self);
    }

    public FindApisByPagingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindApisByPagingResponse setBody(FindApisByPagingResponseBody body) {
        this.body = body;
        return this;
    }
    public FindApisByPagingResponseBody getBody() {
        return this.body;
    }

}
