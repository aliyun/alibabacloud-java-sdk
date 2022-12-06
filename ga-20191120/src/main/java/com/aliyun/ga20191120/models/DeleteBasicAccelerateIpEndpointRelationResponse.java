// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicAccelerateIpEndpointRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBasicAccelerateIpEndpointRelationResponseBody body;

    public static DeleteBasicAccelerateIpEndpointRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicAccelerateIpEndpointRelationResponse self = new DeleteBasicAccelerateIpEndpointRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBasicAccelerateIpEndpointRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBasicAccelerateIpEndpointRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBasicAccelerateIpEndpointRelationResponse setBody(DeleteBasicAccelerateIpEndpointRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBasicAccelerateIpEndpointRelationResponseBody getBody() {
        return this.body;
    }

}
