// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchCreateDomainItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateDomainItemsResponseBody body;

    public static BatchCreateDomainItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDomainItemsResponse self = new BatchCreateDomainItemsResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateDomainItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateDomainItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateDomainItemsResponse setBody(BatchCreateDomainItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateDomainItemsResponseBody getBody() {
        return this.body;
    }

}
