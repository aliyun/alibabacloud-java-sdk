// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindCustomerSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindCustomerSnapshotResponseBody body;

    public static FindCustomerSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        FindCustomerSnapshotResponse self = new FindCustomerSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public FindCustomerSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindCustomerSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindCustomerSnapshotResponse setBody(FindCustomerSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public FindCustomerSnapshotResponseBody getBody() {
        return this.body;
    }

}
