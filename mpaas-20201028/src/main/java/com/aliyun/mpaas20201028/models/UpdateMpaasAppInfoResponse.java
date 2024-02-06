// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMpaasAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMpaasAppInfoResponseBody body;

    public static UpdateMpaasAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMpaasAppInfoResponse self = new UpdateMpaasAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMpaasAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMpaasAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMpaasAppInfoResponse setBody(UpdateMpaasAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMpaasAppInfoResponseBody getBody() {
        return this.body;
    }

}
