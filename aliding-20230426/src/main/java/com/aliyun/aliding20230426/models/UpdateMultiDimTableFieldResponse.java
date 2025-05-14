// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMultiDimTableFieldResponseBody body;

    public static UpdateMultiDimTableFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableFieldResponse self = new UpdateMultiDimTableFieldResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMultiDimTableFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMultiDimTableFieldResponse setBody(UpdateMultiDimTableFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMultiDimTableFieldResponseBody getBody() {
        return this.body;
    }

}
