// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListResultExportJobHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResultExportJobHistoryResponseBody body;

    public static ListResultExportJobHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResultExportJobHistoryResponse self = new ListResultExportJobHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListResultExportJobHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResultExportJobHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResultExportJobHistoryResponse setBody(ListResultExportJobHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResultExportJobHistoryResponseBody getBody() {
        return this.body;
    }

}
