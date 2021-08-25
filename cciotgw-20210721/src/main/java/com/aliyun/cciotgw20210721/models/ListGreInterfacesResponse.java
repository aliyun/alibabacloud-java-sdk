// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListGreInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGreInterfacesResponseBody body;

    public static ListGreInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGreInterfacesResponse self = new ListGreInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public ListGreInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGreInterfacesResponse setBody(ListGreInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGreInterfacesResponseBody getBody() {
        return this.body;
    }

}
