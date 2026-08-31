// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityArchiveTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQualityArchiveTablesResponseBody body;

    public static ListQualityArchiveTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityArchiveTablesResponse self = new ListQualityArchiveTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityArchiveTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityArchiveTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQualityArchiveTablesResponse setBody(ListQualityArchiveTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityArchiveTablesResponseBody getBody() {
        return this.body;
    }

}
