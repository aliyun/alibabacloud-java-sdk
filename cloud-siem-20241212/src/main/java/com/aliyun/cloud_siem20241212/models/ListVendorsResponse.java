// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListVendorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVendorsResponseBody body;

    public static ListVendorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVendorsResponse self = new ListVendorsResponse();
        return TeaModel.build(map, self);
    }

    public ListVendorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVendorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVendorsResponse setBody(ListVendorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVendorsResponseBody getBody() {
        return this.body;
    }

}
