// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListExtendfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExtendfilesResponseBody body;

    public static ListExtendfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExtendfilesResponse self = new ListExtendfilesResponse();
        return TeaModel.build(map, self);
    }

    public ListExtendfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExtendfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExtendfilesResponse setBody(ListExtendfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExtendfilesResponseBody getBody() {
        return this.body;
    }

}
