// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAccountsResponseBody body;

    public static ListCloudAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountsResponse self = new ListCloudAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAccountsResponse setBody(ListCloudAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAccountsResponseBody getBody() {
        return this.body;
    }

}
