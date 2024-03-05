// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSoftwaresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSoftwaresResponseBody body;

    public static ListSoftwaresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwaresResponse self = new ListSoftwaresResponse();
        return TeaModel.build(map, self);
    }

    public ListSoftwaresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSoftwaresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSoftwaresResponse setBody(ListSoftwaresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSoftwaresResponseBody getBody() {
        return this.body;
    }

}
