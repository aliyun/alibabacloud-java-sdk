// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListVscsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVscsResponseBody body;

    public static ListVscsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVscsResponse self = new ListVscsResponse();
        return TeaModel.build(map, self);
    }

    public ListVscsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVscsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVscsResponse setBody(ListVscsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVscsResponseBody getBody() {
        return this.body;
    }

}
