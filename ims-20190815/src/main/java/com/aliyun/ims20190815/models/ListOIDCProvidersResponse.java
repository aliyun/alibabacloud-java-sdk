// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListOIDCProvidersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListOIDCProvidersResponse setBody(ListOIDCProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOIDCProvidersResponseBody getBody() {
        return this.body;
    }

}
