// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKmsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKmsInstancesResponseBody body;

    public static ListKmsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKmsInstancesResponse self = new ListKmsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListKmsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKmsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKmsInstancesResponse setBody(ListKmsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKmsInstancesResponseBody getBody() {
        return this.body;
    }

}
