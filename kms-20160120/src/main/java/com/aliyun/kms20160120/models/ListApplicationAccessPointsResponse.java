// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListApplicationAccessPointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationAccessPointsResponseBody body;

    public static ListApplicationAccessPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAccessPointsResponse self = new ListApplicationAccessPointsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationAccessPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationAccessPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationAccessPointsResponse setBody(ListApplicationAccessPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationAccessPointsResponseBody getBody() {
        return this.body;
    }

}
