// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListChannelSupplierResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListChannelSupplierResponseBody body;

    public static ListChannelSupplierResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChannelSupplierResponse self = new ListChannelSupplierResponse();
        return TeaModel.build(map, self);
    }

    public ListChannelSupplierResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChannelSupplierResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChannelSupplierResponse setBody(ListChannelSupplierResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChannelSupplierResponseBody getBody() {
        return this.body;
    }

}
