// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChainInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChainInstanceResponseBody body;

    public static ListChainInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChainInstanceResponse self = new ListChainInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListChainInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChainInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChainInstanceResponse setBody(ListChainInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChainInstanceResponseBody getBody() {
        return this.body;
    }

}
