// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMPCoSPhaseHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMPCoSPhaseHistoryResponseBody body;

    public static ListMPCoSPhaseHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMPCoSPhaseHistoryResponse self = new ListMPCoSPhaseHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListMPCoSPhaseHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMPCoSPhaseHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMPCoSPhaseHistoryResponse setBody(ListMPCoSPhaseHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMPCoSPhaseHistoryResponseBody getBody() {
        return this.body;
    }

}
