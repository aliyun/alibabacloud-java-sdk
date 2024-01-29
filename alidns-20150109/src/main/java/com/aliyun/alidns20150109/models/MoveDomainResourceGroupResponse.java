// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveDomainResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveDomainResourceGroupResponseBody body;

    public static MoveDomainResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveDomainResourceGroupResponse self = new MoveDomainResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public MoveDomainResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveDomainResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveDomainResourceGroupResponse setBody(MoveDomainResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveDomainResourceGroupResponseBody getBody() {
        return this.body;
    }

}
