// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListSAMLProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSAMLProvidersResponseBody body;

    public static ListSAMLProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSAMLProvidersResponse self = new ListSAMLProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListSAMLProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSAMLProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSAMLProvidersResponse setBody(ListSAMLProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSAMLProvidersResponseBody getBody() {
        return this.body;
    }

}
