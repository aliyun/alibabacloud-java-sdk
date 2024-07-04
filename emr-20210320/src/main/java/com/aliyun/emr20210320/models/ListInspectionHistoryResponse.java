// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListInspectionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInspectionHistoryResponseBody body;

    public static ListInspectionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionHistoryResponse self = new ListInspectionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListInspectionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInspectionHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInspectionHistoryResponse setBody(ListInspectionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInspectionHistoryResponseBody getBody() {
        return this.body;
    }

}
