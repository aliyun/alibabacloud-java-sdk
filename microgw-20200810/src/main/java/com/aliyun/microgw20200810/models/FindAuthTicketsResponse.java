// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindAuthTicketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindAuthTicketsResponseBody body;

    public static FindAuthTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        FindAuthTicketsResponse self = new FindAuthTicketsResponse();
        return TeaModel.build(map, self);
    }

    public FindAuthTicketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindAuthTicketsResponse setBody(FindAuthTicketsResponseBody body) {
        this.body = body;
        return this;
    }
    public FindAuthTicketsResponseBody getBody() {
        return this.body;
    }

}
