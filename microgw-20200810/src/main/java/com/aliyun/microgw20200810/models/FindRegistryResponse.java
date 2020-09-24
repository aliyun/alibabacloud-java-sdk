// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindRegistryResponseBody body;

    public static FindRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        FindRegistryResponse self = new FindRegistryResponse();
        return TeaModel.build(map, self);
    }

    public FindRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindRegistryResponse setBody(FindRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public FindRegistryResponseBody getBody() {
        return this.body;
    }

}
