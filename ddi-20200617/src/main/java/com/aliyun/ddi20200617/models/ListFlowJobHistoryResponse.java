// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowJobHistoryResponseBody body;

    public static ListFlowJobHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobHistoryResponse self = new ListFlowJobHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowJobHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowJobHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowJobHistoryResponse setBody(ListFlowJobHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowJobHistoryResponseBody getBody() {
        return this.body;
    }

}
