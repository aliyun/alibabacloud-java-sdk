// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListVpcBindingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcBindingsOutput body;

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

    public ListVpcBindingsResponse setBody(ListVpcBindingsOutput body) {
        this.body = body;
        return this;
    }
    public ListVpcBindingsOutput getBody() {
        return this.body;
    }

}
