// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class XpackRelateDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public XpackRelateDBResponseBody body;

    public static XpackRelateDBResponse build(java.util.Map<String, ?> map) throws Exception {
        XpackRelateDBResponse self = new XpackRelateDBResponse();
        return TeaModel.build(map, self);
    }

    public XpackRelateDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XpackRelateDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public XpackRelateDBResponse setBody(XpackRelateDBResponseBody body) {
        this.body = body;
        return this;
    }
    public XpackRelateDBResponseBody getBody() {
        return this.body;
    }

}
