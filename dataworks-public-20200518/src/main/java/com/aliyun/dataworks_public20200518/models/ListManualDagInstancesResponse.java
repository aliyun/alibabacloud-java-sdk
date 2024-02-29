// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListManualDagInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListManualDagInstancesResponseBody body;

    public static ListManualDagInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManualDagInstancesResponse self = new ListManualDagInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListManualDagInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListManualDagInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListManualDagInstancesResponse setBody(ListManualDagInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListManualDagInstancesResponseBody getBody() {
        return this.body;
    }

}
