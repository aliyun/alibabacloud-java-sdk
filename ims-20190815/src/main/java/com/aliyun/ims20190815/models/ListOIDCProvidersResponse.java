// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListOIDCProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOIDCProvidersResponseBody body;

    public static ListOIDCProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOIDCProvidersResponse self = new ListOIDCProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListOIDCProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOIDCProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOIDCProvidersResponse setBody(ListOIDCProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOIDCProvidersResponseBody getBody() {
        return this.body;
    }

}
