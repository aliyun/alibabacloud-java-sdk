// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstancesQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancesQuotaResponseBody body;

    public static ListInstancesQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesQuotaResponse self = new ListInstancesQuotaResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancesQuotaResponse setBody(ListInstancesQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesQuotaResponseBody getBody() {
        return this.body;
    }

}
