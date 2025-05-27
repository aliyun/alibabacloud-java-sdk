// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ListRebalanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRebalanceInfoResponseBody body;

    public static ListRebalanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRebalanceInfoResponse self = new ListRebalanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListRebalanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRebalanceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRebalanceInfoResponse setBody(ListRebalanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRebalanceInfoResponseBody getBody() {
        return this.body;
    }

}
