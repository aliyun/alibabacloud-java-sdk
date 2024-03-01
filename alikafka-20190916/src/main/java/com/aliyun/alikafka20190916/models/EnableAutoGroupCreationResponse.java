// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class EnableAutoGroupCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAutoGroupCreationResponseBody body;

    public static EnableAutoGroupCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoGroupCreationResponse self = new EnableAutoGroupCreationResponse();
        return TeaModel.build(map, self);
    }

    public EnableAutoGroupCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAutoGroupCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAutoGroupCreationResponse setBody(EnableAutoGroupCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAutoGroupCreationResponseBody getBody() {
        return this.body;
    }

}
