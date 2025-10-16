// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateAclCheckDetailStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAclCheckDetailStatusResponseBody body;

    public static UpdateAclCheckDetailStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclCheckDetailStatusResponse self = new UpdateAclCheckDetailStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAclCheckDetailStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAclCheckDetailStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAclCheckDetailStatusResponse setBody(UpdateAclCheckDetailStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAclCheckDetailStatusResponseBody getBody() {
        return this.body;
    }

}
