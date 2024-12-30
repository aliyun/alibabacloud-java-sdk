// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeTableNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakeTableNameResponseBody body;

    public static ListDataLakeTableNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeTableNameResponse self = new ListDataLakeTableNameResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakeTableNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakeTableNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakeTableNameResponse setBody(ListDataLakeTableNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakeTableNameResponseBody getBody() {
        return this.body;
    }

}
