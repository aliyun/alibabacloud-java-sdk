// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobHistoryResponseBody body;

    public static ListJobHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobHistoryResponse self = new ListJobHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListJobHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobHistoryResponse setBody(ListJobHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobHistoryResponseBody getBody() {
        return this.body;
    }

}
