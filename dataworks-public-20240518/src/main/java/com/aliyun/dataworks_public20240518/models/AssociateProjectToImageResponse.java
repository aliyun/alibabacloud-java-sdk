// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AssociateProjectToImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateProjectToImageResponseBody body;

    public static AssociateProjectToImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateProjectToImageResponse self = new AssociateProjectToImageResponse();
        return TeaModel.build(map, self);
    }

    public AssociateProjectToImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateProjectToImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateProjectToImageResponse setBody(AssociateProjectToImageResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateProjectToImageResponseBody getBody() {
        return this.body;
    }

}
