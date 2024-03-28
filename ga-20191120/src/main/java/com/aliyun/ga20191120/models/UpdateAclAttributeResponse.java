// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAclAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAclAttributeResponseBody body;

    public static UpdateAclAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclAttributeResponse self = new UpdateAclAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAclAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAclAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAclAttributeResponse setBody(UpdateAclAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAclAttributeResponseBody getBody() {
        return this.body;
    }

}
