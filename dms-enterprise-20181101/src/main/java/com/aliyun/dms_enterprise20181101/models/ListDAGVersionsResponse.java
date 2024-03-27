// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDAGVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDAGVersionsResponseBody body;

    public static ListDAGVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDAGVersionsResponse self = new ListDAGVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDAGVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDAGVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDAGVersionsResponse setBody(ListDAGVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDAGVersionsResponseBody getBody() {
        return this.body;
    }

}
