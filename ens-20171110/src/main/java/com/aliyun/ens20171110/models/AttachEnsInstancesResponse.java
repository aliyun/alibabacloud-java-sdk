// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachEnsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachEnsInstancesResponseBody body;

    public static AttachEnsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachEnsInstancesResponse self = new AttachEnsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AttachEnsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachEnsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachEnsInstancesResponse setBody(AttachEnsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachEnsInstancesResponseBody getBody() {
        return this.body;
    }

}
