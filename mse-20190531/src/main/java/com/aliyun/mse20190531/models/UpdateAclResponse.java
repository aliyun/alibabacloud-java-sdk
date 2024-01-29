// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAclResponseBody body;

    public static UpdateAclResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclResponse self = new UpdateAclResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAclResponse setBody(UpdateAclResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAclResponseBody getBody() {
        return this.body;
    }

}
