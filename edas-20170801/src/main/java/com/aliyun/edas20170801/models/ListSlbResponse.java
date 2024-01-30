// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSlbResponseBody body;

    public static ListSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlbResponse self = new ListSlbResponse();
        return TeaModel.build(map, self);
    }

    public ListSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSlbResponse setBody(ListSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlbResponseBody getBody() {
        return this.body;
    }

}
