// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class UpdateGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupInfoResponseBody body;

    public static UpdateGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupInfoResponse self = new UpdateGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupInfoResponse setBody(UpdateGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupInfoResponseBody getBody() {
        return this.body;
    }

}
