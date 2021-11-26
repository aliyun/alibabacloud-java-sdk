// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ListAnycastEipAddressesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAnycastEipAddressesResponseBody body;

    public static ListAnycastEipAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnycastEipAddressesResponse self = new ListAnycastEipAddressesResponse();
        return TeaModel.build(map, self);
    }

    public ListAnycastEipAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnycastEipAddressesResponse setBody(ListAnycastEipAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnycastEipAddressesResponseBody getBody() {
        return this.body;
    }

}
