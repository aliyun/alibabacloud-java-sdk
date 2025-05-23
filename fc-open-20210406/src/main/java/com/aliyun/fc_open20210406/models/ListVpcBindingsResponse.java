// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListVpcBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcBindingsResponseBody body;

    public static ListVpcBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcBindingsResponse self = new ListVpcBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcBindingsResponse setBody(ListVpcBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcBindingsResponseBody getBody() {
        return this.body;
    }

}
