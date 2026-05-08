// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContextStoreAPIKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextStoreAPIKeysResponseBody body;

    public static ListContextStoreAPIKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextStoreAPIKeysResponse self = new ListContextStoreAPIKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListContextStoreAPIKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextStoreAPIKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextStoreAPIKeysResponse setBody(ListContextStoreAPIKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextStoreAPIKeysResponseBody getBody() {
        return this.body;
    }

}
