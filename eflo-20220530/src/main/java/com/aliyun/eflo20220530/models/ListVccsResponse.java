// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVccsResponseBody body;

    public static ListVccsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVccsResponse self = new ListVccsResponse();
        return TeaModel.build(map, self);
    }

    public ListVccsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVccsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVccsResponse setBody(ListVccsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVccsResponseBody getBody() {
        return this.body;
    }

}
