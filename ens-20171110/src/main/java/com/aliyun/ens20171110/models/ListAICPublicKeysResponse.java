// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListAICPublicKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAICPublicKeysResponseBody body;

    public static ListAICPublicKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAICPublicKeysResponse self = new ListAICPublicKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListAICPublicKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAICPublicKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAICPublicKeysResponse setBody(ListAICPublicKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAICPublicKeysResponseBody getBody() {
        return this.body;
    }

}
