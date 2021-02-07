// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListSAMLProvidersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSAMLProvidersResponse setBody(ListSAMLProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSAMLProvidersResponseBody getBody() {
        return this.body;
    }

}
