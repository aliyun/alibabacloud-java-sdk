// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationBaseInfoResponseBody body;

    public static UpdateApplicationBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationBaseInfoResponse self = new UpdateApplicationBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationBaseInfoResponse setBody(UpdateApplicationBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationBaseInfoResponseBody getBody() {
        return this.body;
    }

}
