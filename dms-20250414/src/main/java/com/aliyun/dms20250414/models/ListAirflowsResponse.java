// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAirflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAirflowsResponseBody body;

    public static ListAirflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAirflowsResponse self = new ListAirflowsResponse();
        return TeaModel.build(map, self);
    }

    public ListAirflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAirflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAirflowsResponse setBody(ListAirflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAirflowsResponseBody getBody() {
        return this.body;
    }

}
