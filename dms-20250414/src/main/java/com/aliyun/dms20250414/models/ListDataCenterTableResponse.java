// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataCenterTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCenterTableResponseBody body;

    public static ListDataCenterTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCenterTableResponse self = new ListDataCenterTableResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCenterTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCenterTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCenterTableResponse setBody(ListDataCenterTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCenterTableResponseBody getBody() {
        return this.body;
    }

}
