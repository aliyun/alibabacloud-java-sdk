// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindGatewaysResponseBody body;

    public static FindGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        FindGatewaysResponse self = new FindGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public FindGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindGatewaysResponse setBody(FindGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public FindGatewaysResponseBody getBody() {
        return this.body;
    }

}
