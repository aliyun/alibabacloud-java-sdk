// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAirflowVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAirflowVersionsResponseBody body;

    public static ListAirflowVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAirflowVersionsResponse self = new ListAirflowVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAirflowVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAirflowVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAirflowVersionsResponse setBody(ListAirflowVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAirflowVersionsResponseBody getBody() {
        return this.body;
    }

}
