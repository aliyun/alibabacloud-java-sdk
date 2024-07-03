// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListLFUAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLFUAppResponseBody body;

    public static ListLFUAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLFUAppResponse self = new ListLFUAppResponse();
        return TeaModel.build(map, self);
    }

    public ListLFUAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLFUAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLFUAppResponse setBody(ListLFUAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLFUAppResponseBody getBody() {
        return this.body;
    }

}
