// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakeTableResponseBody body;

    public static ListDataLakeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeTableResponse self = new ListDataLakeTableResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakeTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakeTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakeTableResponse setBody(ListDataLakeTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakeTableResponseBody getBody() {
        return this.body;
    }

}
