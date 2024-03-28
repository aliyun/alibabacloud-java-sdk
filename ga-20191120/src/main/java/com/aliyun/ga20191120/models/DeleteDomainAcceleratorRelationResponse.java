// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteDomainAcceleratorRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDomainAcceleratorRelationResponseBody body;

    public static DeleteDomainAcceleratorRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainAcceleratorRelationResponse self = new DeleteDomainAcceleratorRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainAcceleratorRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainAcceleratorRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainAcceleratorRelationResponse setBody(DeleteDomainAcceleratorRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainAcceleratorRelationResponseBody getBody() {
        return this.body;
    }

}
