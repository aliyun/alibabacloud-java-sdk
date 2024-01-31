// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesToNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachInstancesToNodePoolResponseBody body;

    public static AttachInstancesToNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesToNodePoolResponse self = new AttachInstancesToNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public AttachInstancesToNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachInstancesToNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachInstancesToNodePoolResponse setBody(AttachInstancesToNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachInstancesToNodePoolResponseBody getBody() {
        return this.body;
    }

}
