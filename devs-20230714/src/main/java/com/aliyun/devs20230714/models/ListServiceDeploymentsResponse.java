// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListServiceDeploymentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceDeploymentsResponseBody body;

    public static ListServiceDeploymentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceDeploymentsResponse self = new ListServiceDeploymentsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceDeploymentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceDeploymentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceDeploymentsResponse setBody(ListServiceDeploymentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceDeploymentsResponseBody getBody() {
        return this.body;
    }

}
