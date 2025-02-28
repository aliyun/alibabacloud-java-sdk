// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DeleteMajorCustomerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMajorCustomerResponseBody body;

    public static DeleteMajorCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMajorCustomerResponse self = new DeleteMajorCustomerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMajorCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMajorCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMajorCustomerResponse setBody(DeleteMajorCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMajorCustomerResponseBody getBody() {
        return this.body;
    }

}
