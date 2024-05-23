// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class AttachInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachInstancesResponseBody body;

    public static AttachInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesResponse self = new AttachInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AttachInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachInstancesResponse setBody(AttachInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachInstancesResponseBody getBody() {
        return this.body;
    }

}
